package util;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseUtilTest {
    @Test
    void connectionTest() throws SQLException {
        HikariDataSource dataSource = DatabaseUtil.getDatasource();
        Connection connection = dataSource.getConnection();

        connection.close();
        dataSource.close();
    }
}
