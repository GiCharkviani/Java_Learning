import {ChangeDetectionStrategy, Component, EventEmitter, Output} from '@angular/core';
import {FormBuilder, FormControl} from "@angular/forms";
import {ITodo, ITodoForm} from "../../interfaces/ITodo";


@Component({
  selector: 'app-card-form',
  templateUrl: './card-form.component.html',
  styleUrls: ['./card-form.component.scss'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class CardFormComponent  {
  @Output() add = new EventEmitter<ITodo>();

  public readonly todoForm = this.formBuilder.group<ITodoForm>({
    id: new FormControl(null),
    whatTodo: new FormControl(null),
    whenTodo: new FormControl(new Date())
  });

  constructor(
    private readonly formBuilder: FormBuilder,
  ) {}

  public saveTodo(): void {
    this.add.next(this.todoForm.getRawValue() as ITodo);
    this.todoForm.patchValue({
      whatTodo: null,
      whenTodo: new Date()
    });
  }

}
