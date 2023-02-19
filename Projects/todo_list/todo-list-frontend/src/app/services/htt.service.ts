import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {ITodo} from "../interfaces/ITodo";
import {environment} from "../../environments/environment.prod";

@Injectable({providedIn: 'root'})
export class HttService {
  constructor(private readonly httpClient: HttpClient) {
  }

  public getTodos(): Observable<ITodo[]> {
    return this.httpClient.get<ITodo[]>(environment.restUrl);
  }
}
