package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public final class Util {
    private static final String url = "db.url";
    private static final String username = "db.username";
    private static final String password = "db.password";

    private Util() {
    }

    public static Connection getConnection()
            throws SQLException, RuntimeException {

        return DriverManager.getConnection(
                Property.get(url),
                Property.get(username),
                Property.get(password));
    }
}
