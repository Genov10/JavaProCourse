package edu.hw4_oop;
public class Counter {
    private int animalCount;
    private int catCount;
    private int dogCount;
    private int totalCount;

    public Counter() {
        dogCount=0;
        animalCount=0;
        catCount=0;
        totalCount = 0;
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

    public void totalAdd(){
        totalCount = catCount + dogCount + animalCount;
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
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
}