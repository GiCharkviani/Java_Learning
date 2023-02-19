package com.todoList.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Table
@Entity(name = "todo")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "what_todo")
    private String whatTodo;

    @Column(name = "when_todo")
    private Timestamp whenTodo;

    public Todo() {}

    public Todo(String whatTodo, Timestamp whenTodo) {
        this.whatTodo = whatTodo;
        this.whenTodo = whenTodo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWhatTodo() {
        return whatTodo;
    }

    public void setWhatTodo(String whatTodo) {
        this.whatTodo = whatTodo;
    }

    public Timestamp getWhenTodo() {
        return whenTodo;
    }

    public void setWhenTodo(Timestamp whenTodo) {
        this.whenTodo = whenTodo;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", whatTodo='" + whatTodo + '\'' +
                ", whenTodo=" + whenTodo +
                '}';
    }
}
