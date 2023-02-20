package com.todoList.dao;

import com.todoList.entities.Todo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TodoDAO implements ITodoDAO {

    private final EntityManager entityManager;

    @Autowired
    public TodoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<Todo> getAll() {
        Query theQuery = entityManager.createQuery("FROM todo ORDER BY whenTodo desc");
        return theQuery.getResultList();
    }

    @Override
    public Todo findById(long id) {
        return entityManager.find(Todo.class, id);
    }

    @Override
    public void save(Todo todo_value) {
        Todo dbTodo = entityManager.merge(todo_value);
    }

    @Override
    public void deleteById(long id) {
        Query theQuery = entityManager.createQuery("delete from todo where id=:todoId")
                .setParameter("todoId", id);
        theQuery.executeUpdate();
    }
}
