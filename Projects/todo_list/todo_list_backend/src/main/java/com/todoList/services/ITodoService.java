package com.todoList.services;

import com.todoList.entities.Todo;

import java.util.List;

public interface ITodoService  {
    List<Todo> getAll();
    Todo findById(long id);
    void save(Todo todo_value);
    void deleteById(long id);
}
