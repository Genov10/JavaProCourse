CREATE TABLE Homework (
                          id INT PRIMARY KEY AUTO_INCREMENT,
                          name VARCHAR(50),
                          description VARCHAR(256)
);

CREATE TABLE Lesson(
                       id INT PRIMARY KEY AUTO_INCREMENT,
                       name VARCHAR(50) NOT NULL,
                       updatedAt DATETIME NOT NULL ,
                       homework_Id INT NOT NULL,
                       FOREIGN KEY (homework_Id) REFERENCES Homework(id)
);

CREATE TABLE Schedule(
                         id INT PRIMARY KEY AUTO_INCREMENT,
                         name VARCHAR(50) NOT NULL,
                         updatedAt DATETIME NOT NULL ,
                         lessons JSON NOT NULL
);

ALTER TABLE Schedule
    ADD CONSTRAINT fk_schedule_lessons
        FOREIGN KEY (lessons) REFERENCES Lesson(id) ON DELETE CASCADE ;




