import {ChangeDetectionStrategy, ChangeDetectorRef, Component} from '@angular/core';
import {HttService} from "./services/htt.service";
import {ITodo} from "./interfaces/ITodo";
import {exhaustMap, Observable, pipe} from "rxjs";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class AppComponent {
  public todos$!: Observable<ITodo[]>;
  public editing!: ITodo | undefined;
  public editMode: boolean = false;

  constructor(private readonly httpService: HttService, private readonly cdr: ChangeDetectorRef) {
    this.todos$ = httpService.getTodos();
  }

  public deleteTodo(id: number): void {
    this.todos$ = this.httpService.deleteTodo(id)
      .pipe(
        exhaustMap(() => this.httpService.getTodos())
      )
  }

  public addTodo(value: string): void {
    const todo: Partial<ITodo> = {
      whatTodo: value,
      whenTodo: new Date()
    }
    this.httpService.addTodo(todo).subscribe();
  }

  public editTodo(value: string, id: number): void {
    const todo: Partial<ITodo> = {
      id: id,
      whatTodo: value,
      whenTodo: new Date()
    }
    this.httpService.addTodo(todo).subscribe({
      next: () => {
        this.cdr.markForCheck();
        this.editMode = false;
        this.editing = undefined;
      }}
    );
  }

  public edit(id: number): void {
    this.httpService.getTodo(id).subscribe({
      next: (todo: ITodo) => {
        this.cdr.markForCheck();
        this.editing = todo;
        this.editMode = true;
      }
    })
  }
}
