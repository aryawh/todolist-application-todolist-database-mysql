import View.TodolistView;
import com.zaxxer.hikari.HikariDataSource;
import repository.TodolistRepository;
import repository.TodolistRepositoryImpl;
import service.TodolistService;
import service.TodolistServiceImpl;
import util.DatabaseUtil;

public class AplikasiTodolist {
    public static void main(String[] args) {
        HikariDataSource dataSource = DatabaseUtil.getDatasource();
        TodolistRepository todolistRepository = new TodolistRepositoryImpl(dataSource);
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);

        todolistView.showTodolist();
    }
}
