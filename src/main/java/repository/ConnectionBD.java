package repository;

import java.sql.*;

public class ConnectionBD {
    private final String url = "jdbc:h2:test";
    private final String user = "sa";
    private final String password = "";

    public Connection connection() {
        Connection conn = null;
        try {
            Class.forName("org.h2.Driver").newInstance();
            conn =  DriverManager.getConnection(this.url, this.user, this.password);
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
