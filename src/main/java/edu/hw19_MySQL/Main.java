package edu.hw19_MySQL;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DataBaseConnection dbConnection = new DataBaseConnection();
        LessonDao lessonDAO = new LessonDao(dbConnection);

        Lesson lesson = new Lesson(1,"MySQL", new Homework(1,"Create schema", "create schema with MySQL"));

        lessonDAO.addLesson(lesson);
        lessonDAO.getLessonById(1);
        lessonDAO.getAllLessons();
        lessonDAO.deleteLesson(1);
    }
}
