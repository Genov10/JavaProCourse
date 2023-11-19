package edu.hw21_testing.DS.DatabaseDs;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DbDAO {
    private final Connection connection;

    public DbDAO(Connection connection) {
        this.connection = connection;
    }

    void  addData(String newData) {
        try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO hw21.hw21 VALUES(?, ?)")) {
            preparedStatement.setString(1, newData);
            preparedStatement.addBatch();
            preparedStatement.executeBatch();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    String getData(int index){
        List<String> data = new ArrayList<>();
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT name FROM hw21.hw21")) {
            while (resultSet.next()) {
                data.add(resultSet.getString("name"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return data.get(index);
    }

    void delete (int index){
        List<String> data = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO hw21.hw21 VALUES(?, ?)");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT name FROM hw21.hw21")) {
            while (resultSet.next()) {
                data.add(resultSet.getString("name"));
            }
            data.remove(index);
            for (String str : data){
                preparedStatement.setString(1, str);
                preparedStatement.addBatch();
                preparedStatement.executeBatch();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
