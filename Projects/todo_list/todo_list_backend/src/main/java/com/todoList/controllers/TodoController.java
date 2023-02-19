package com.todoList.controllers;

import com.todoList.entities.Todo;
import com.todoList.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class TodoController {

    private final TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/todo")
    List<Todo> getTodos() {
        return todoService.getAll();
    }

    @GetMapping("/todo/{todoId}")
    Todo getTodo(@PathVariable int todoId) {
        Todo tempTodo = todoService.findById(todoId);
        if(tempTodo == null)
            throw new RuntimeException("Todo id not found - " + todoId);
        return tempTodo;
    }

    @PostMapping("/todo")
    Todo saveTodo(@RequestBody Todo todo) {
        System.out.println(todo);
        todoService.save(todo);
        return todo;
    }

    @PutMapping("/todo")
    Todo updateTodo(@RequestBody Todo todo) {
        todoService.save(todo);
        return todo;
    }

    @DeleteMapping("/todo/{todoId}")
    Todo deleteTodo(@PathVariable int todoId) {
        Todo tempTodo = todoService.findById(todoId);
        if(tempTodo == null)
            throw new RuntimeException("Todo id not found - " + todoId);
        todoService.deleteById(todoId);
        return tempTodo;
    }
}
