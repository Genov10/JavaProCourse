package edu.hw19_MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/homework19";
    private static final String USER = "root";
    private static final String PASSWORD = "hillel";
    Connection connection;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public DataBaseConnection() throws SQLException{
        this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public Connection getConnection(){
        return connection;
    }
    public void close() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}
