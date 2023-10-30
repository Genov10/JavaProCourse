package edu.hw19_MySQL;

import java.sql.Timestamp;

public class Lesson {
    private int id;
    private String name;
    private final Timestamp updatedAt;
    private Homework homework;

    public Lesson(int id, String name, Homework homework) {
        this.id = id;
        this.name = name;
        this.homework = homework;
        this.updatedAt = new Timestamp(System.currentTimeMillis());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Homework getHomework() {
        return homework;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }
}
