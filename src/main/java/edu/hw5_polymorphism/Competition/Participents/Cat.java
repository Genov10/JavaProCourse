package edu.hw5_polymorphism.Competition.Participents;

public class Cat extends Participants{
    private final int MAX_DISTANCE_RUN = 75;
    private final int MAX_HEIGHT_JUMP = 2;

    public Cat(String name) {
        super(name);
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
}
