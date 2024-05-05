package repository;

import com.zaxxer.hikari.HikariDataSource;
import entity.Todolist;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.DatabaseUtil;

import javax.xml.crypto.Data;

public class TodolistRepositoryImplTest {
    private HikariDataSource dataSource;
    private TodolistRepository todolistRepository;
    @BeforeEach
    void setUp() {
        dataSource = DatabaseUtil.getDatasource();
        todolistRepository = new TodolistRepositoryImpl(dataSource);
    }

    @Test
    void testAdd() {
        Todolist todolist = new Todolist();
        todolist.setTodo("Widya");
        todolistRepository.add(todolist);
    }
    @Test
    void testRemove(){
        System.out.println(todolistRepository.remove(1));
        System.out.println(todolistRepository.remove(2));
        System.out.println(todolistRepository.remove(3));
        System.out.println(todolistRepository.remove(4));
    }

    @Test
    void testGetAll() {
        todolistRepository.add(new Todolist("Hastungkoro"));
        todolistRepository.add(new Todolist("Arya"));
        todolistRepository.add(new Todolist("Widya"));

        Todolist[] todolist = todolistRepository.getAll();
        for (var todo: todolist){
            System.out.println(todo.getId() + " "+ todo.getTodo());
        }
    }

    @AfterEach
    void tearDown() {
        dataSource.close();
    }
}
