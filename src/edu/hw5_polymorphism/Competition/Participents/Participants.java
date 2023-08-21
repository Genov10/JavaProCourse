package edu.hw5_polymorphism.Competition.Participents;

public class Participants {
    protected String name;
    protected int MAX_DISTANCE_RUN;
    protected int MAX_HEIGHT_JUMP;

    public Participants(String name) {
        this.name = name;
    }

    public void run(int distance){
        if (distance < MAX_DISTANCE_RUN) {
            System.out.println(name + " has run " + distance + " meeter!");
        } else {
            System.out.println(name + " couldn't complete the action!");
        }
    }
    public void jump(int height){
        if (height < MAX_HEIGHT_JUMP) {
            System.out.println(name + " jumped on " + height + " meter!");
        } else {
            System.out.println(name + " couldn't jumped to this height!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
