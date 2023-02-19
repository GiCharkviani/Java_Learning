import { Component } from '@angular/core';
import {HttService} from "./services/htt.service";
import {ITodo} from "./interfaces/ITodo";
import {Observable} from "rxjs";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  public todos$!: Observable<ITodo[]>;

  constructor(private readonly httpService: HttService) {
    this.todos$ = httpService.getTodos();
  }
}
