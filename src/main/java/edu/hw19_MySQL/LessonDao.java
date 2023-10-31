package edu.hw19_MySQL;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LessonDao {

    private DataBaseConnection dbConnection;

    public LessonDao(DataBaseConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addLesson(Lesson lesson) throws SQLException {
        Connection connection = dbConnection.getConnection();

        PreparedStatement statement = connection.prepareStatement("INSERT INTO homework (name, description) VALUES (?, ?)");
        statement.setString(1, lesson.getHomework().getName());
        statement.setString(2, lesson.getHomework().getDescription());
        statement.execute();

        int homeworkId = statement.getGeneratedKeys().getInt(1);

        statement = connection.prepareStatement("INSERT INTO lesson (name, updatedAt, homework_id) VALUES (?, ?, ?)");
        statement.setString(1, lesson.getName());
        statement.setTimestamp(2, new Timestamp(lesson.getUpdatedAt().getTime()));
        statement.setInt(3, homeworkId);
        statement.execute();

        connection.close();
    }

    public void deleteLesson(int id) throws SQLException {
        Connection connection = dbConnection.getConnection();

        // Delete the lesson from the Lesson table
        PreparedStatement statement = connection.prepareStatement("DELETE FROM lesson WHERE id = ?");
        statement.setInt(1, id);
        statement.execute();

        // Delete the homework from the Homework table
        statement = connection.prepareStatement("DELETE FROM homework WHERE id = ?");
        statement.setInt(1, id);
        statement.execute();

        connection.close();
    }

    public List<Lesson> getAllLessons() throws SQLException {
        Connection connection = dbConnection.getConnection();

        PreparedStatement statement = connection.prepareStatement("SELECT * FROM lesson");
        ResultSet resultSet = statement.executeQuery();

        List<Lesson> lessons = new ArrayList<>();
        while (resultSet.next()) {
            lessons.add(getLessonFromResultSet(resultSet));
        }

        connection.close();
        return lessons;
    }

    public Lesson getLessonById(int id) throws SQLException {
        Connection connection = dbConnection.getConnection();

        PreparedStatement statement = connection.prepareStatement("SELECT * FROM lesson WHERE id = ?");
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();

        Lesson lesson = null;
        if (resultSet.next()) {
            lesson = getLessonFromResultSet(resultSet);
        }

        connection.close();
        return lesson;
    }

    private Lesson getLessonFromResultSet(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        Timestamp updatedAt = resultSet.getTimestamp("updatedAt");
        int homeworkId = resultSet.getInt("homework_id");

        Homework homework = new Homework(homeworkId, resultSet.getString("homework_name"), resultSet.getString("homework_description"));

        return new Lesson(id, name, homework);
    }
}