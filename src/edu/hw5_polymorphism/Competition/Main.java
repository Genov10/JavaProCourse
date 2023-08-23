package edu.hw5_polymorphism.Competition;

import edu.hw5_polymorphism.Competition.Obstracle.ObstacleСourse;
import edu.hw5_polymorphism.Competition.Obstracle.Truck;
import edu.hw5_polymorphism.Competition.Obstracle.Wall;
import edu.hw5_polymorphism.Competition.Participents.Cat;
import edu.hw5_polymorphism.Competition.Participents.Human;
import edu.hw5_polymorphism.Competition.Participents.Participants;
import edu.hw5_polymorphism.Competition.Participents.Robot;

public class Main {
    public static void main(String[] args) {
        Participants[] participants = {
                new Human("Marty McFly"),
                new Cat("Puss in Boots"),
                new Robot("T-1000")
        };

        ObstacleСourse[] obstacleСourses= {
                new Truck(50),
                new Wall(1),
                new Truck(100),
                new Wall(2),
                new Truck(200),
                new Wall(3)
        };

        for (Participants participant : participants) {
            for (ObstacleСourse obstacleСourses1 : obstacleСourses) {
                obstacleСourses1.overcome(participant);
            }
        }

    }
}
