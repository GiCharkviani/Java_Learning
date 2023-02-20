import {FormControl} from "@angular/forms";

export interface ITodo {
  id: number;
  whatTodo: string;
  whenTodo: Date;
}

export interface ITodoForm {
  id?: FormControl<number | null>;
  whatTodo: FormControl<string | null>;
  whenTodo: FormControl<Date | null>;
}
