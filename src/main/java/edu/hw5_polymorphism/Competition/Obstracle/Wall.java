package edu.hw5_polymorphism.Competition.Obstracle;

import edu.hw5_polymorphism.Competition.Participents.Participants;

public class Wall implements ObstacleСourse{
    private int height;
    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void overcome(Participants participants) {
        participants.jump(height);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
