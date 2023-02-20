import {ChangeDetectionStrategy, Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {ITodo} from "../../interfaces/ITodo";

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.scss'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class CardComponent {
  @Input('todo') todoObject!: ITodo;
  @Output('delete') deleteTodo = new EventEmitter<number>();

  public delete(id: number): void {
    this.deleteTodo.emit(id);
  }

}
