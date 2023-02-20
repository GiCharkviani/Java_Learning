package com.todoList.dao;

import com.todoList.entities.Todo;

import java.util.List;

public interface ITodoDAO {
    List<Todo> getAll();
    Todo findById(long id);
    void save(Todo todo_value);
    void deleteById(long id);
}
