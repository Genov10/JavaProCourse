CREATE TABLE Homework(
                         id INT PRIMARY KEY AUTO_INCREMENT,
                         name VARCHAR(255),
                         description VARCHAR(255)
);

CREATE TABLE Lesson(
                       id INT PRIMARY KEY AUTO_INCREMENT,
                       name VARCHAR(255),
                       updatedAt DATETIME NOT NULL,
                       homework_id INT NOT NULL,
                       FOREIGN KEY (homework_id) REFERENCES Homework(id)
);



