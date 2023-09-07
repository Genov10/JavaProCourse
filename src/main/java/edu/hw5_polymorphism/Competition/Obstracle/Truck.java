package edu.hw5_polymorphism.Competition.Obstracle;

import edu.hw5_polymorphism.Competition.Participents.Participants;

public class Truck implements ObstacleСourse{
    private int distance;
    public Truck(int distance) {
        this.distance = distance;
    }

    public void overcome (Participants participants) {
        participants.run(distance);
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
