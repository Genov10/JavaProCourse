package edu.hw21_testing.DS.DatabaseDs;

import edu.hw21_testing.DS.DataStore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbDs implements DataStore {
    private String USER_NAME = "root";
    private String PASSWORD = "root";
    private String URL = "jdbc:mysql://localhost:3306/homework21";
    private Connection connection;
    private DbDAO dbDAO;

    public DbDs() {
        try{
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            dbDAO = new DbDAO(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void addData(String newData) {
        dbDAO.addData(newData);
    }

    @Override
    public String getData(int index) {
        return dbDAO.getData(index);
    }

    @Override
    public void delete(int index) {
        dbDAO.delete(index);
    }
}
