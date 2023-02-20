import {ChangeDetectionStrategy, ChangeDetectorRef, Component} from '@angular/core';
import {exhaustMap, Observable, switchMap} from "rxjs";
import {ITodo} from "../../interfaces/ITodo";
import {HttpService} from "../../services/http.service";

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.scss'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class MainComponent {
  public todos$!: Observable<ITodo[]>;
  public loading: boolean = false;

  constructor(private readonly httpService: HttpService) {
    this.todos$ = httpService.getTodos();
  }

  public track(index: number, todo: ITodo) {
    return todo.id;
  }

  public deleteTodo(id: number): void {
    this.todos$ = this.httpService.deleteTodo(id)
      .pipe(switchMap((todo: ITodo) => this.httpService.getTodos()))
  }

  public addTodo(todo: ITodo): void {
    this.todos$ = this.httpService
      .addTodo(todo)
      .pipe(switchMap(() => this.httpService.getTodos()))
  }
}
