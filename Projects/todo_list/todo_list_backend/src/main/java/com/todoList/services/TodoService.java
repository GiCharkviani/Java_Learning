package com.todoList.services;

import com.todoList.dao.TodoDAO;
import com.todoList.entities.Todo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService implements ITodoService {

    private final TodoDAO todoDAO;

    @Autowired
    public TodoService(TodoDAO todoDAO) {
        this.todoDAO = todoDAO;
    }

    @Override
    @Transactional
    public List<Todo> getAll() {
        return todoDAO.getAll();
    }

    @Override
    @Transactional
    public Todo findById(long id) {
        return todoDAO.findById(id);
    }

    @Override
    @Transactional
    public void save(Todo todo_value) {
        todoDAO.save(todo_value);
    }

    @Override
    @Transactional
    public void deleteById(long id) {
        todoDAO.deleteById(id);
    }
}