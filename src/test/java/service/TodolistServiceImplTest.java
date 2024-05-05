package service;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repository.TodolistRepository;
import repository.TodolistRepositoryImpl;
import util.DatabaseUtil;

import javax.xml.crypto.Data;

public class TodolistServiceImplTest {
    private HikariDataSource dataSource;
    private TodolistService todolistService;
    private TodolistRepository todolistRepository;
    @BeforeEach
    void setUp() {
        dataSource = DatabaseUtil.getDatasource();
        todolistRepository = new TodolistRepositoryImpl(dataSource);
        todolistService = new TodolistServiceImpl(todolistRepository);
    }

    @Test
    void showTodo() {
        todolistService.showTodolist();
    }

    @Test
    void addTodo() {
        todolistService.addTodolist("Wiguna");
    }

    @Test
    void removeTodo() {
        todolistService.removeTodolist(1);
        todolistService.removeTodolist(3);
    }

    @AfterEach
    void tearDown() {
        dataSource.close();
    }
}
