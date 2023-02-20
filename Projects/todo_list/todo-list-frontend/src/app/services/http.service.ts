import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Observable, tap} from "rxjs";
import {ITodo} from "../interfaces/ITodo";
import {environment} from "../../environments/environment.prod";

@Injectable({providedIn: 'root'})
export class HttpService {
  constructor(private readonly httpClient: HttpClient) {
  }

  public getTodos(): Observable<ITodo[]> {
    return this.httpClient.get<ITodo[]>(environment.restUrl)
      .pipe(tap((data) => console.log(data, 'GET ALL')));
  }

  public getTodo(id: number): Observable<ITodo> {
    return this.httpClient.get<ITodo>(environment.restUrl + `/${id}`)
      .pipe(tap((data) => console.log(data, 'GET ONE')));
  }

  public addTodo(todo: Partial<ITodo>): Observable<ITodo> {
    return this.httpClient.post<ITodo>(environment.restUrl, todo)
      .pipe(tap((data) => console.log(data, 'ADD')));
  }

  public updateTodo(todo: ITodo): Observable<ITodo> {
    return this.httpClient.put<ITodo>(environment.restUrl, todo)
      .pipe(tap((data) => console.log(data, 'UPDATE')));
  }

  public deleteTodo(id: number): Observable<ITodo> {
    return this.httpClient.delete<ITodo>(environment.restUrl + `/${id}`)
      .pipe(tap((data) => console.log(data, 'DELETE')));
  }
}
