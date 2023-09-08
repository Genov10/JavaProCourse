package edu.hw4_oop;
public class Counter {
    private int animalCount;
    private int catCount;
    private int dogCount;

    public Counter() {
        dogCount=0;
        animalCount=0;
        catCount=0;
    }

    public void animalAdd(){
        ++animalCount;
    }

    public void dogAdd(){
        ++dogCount;
    }

    public void catAdd(){
        ++catCount;
    }


    public int getAnimalsCount() {
        return animalCount;
    }

    public void setAnimalsCount(int animalsCount) {
        this.animalCount = animalsCount;
    }

    public int getCatsCount() {
        return catCount;
    }

    public void setCatsCount(int catsCount) {
        this.catCount = catsCount;
    }

    public int getDogsCount() {
        return dogCount;
    }

    public void setDogsCount(int dogsCount) {
        this.dogCount = dogsCount;
    }

    public int getTotalCount() {
        return animalCount + catCount + dogCount;
    }


}