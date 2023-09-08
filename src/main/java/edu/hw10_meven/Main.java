package edu.hw10_meven;
import org.example.MyMeth;
public class Main {
    public static void main(String[] args) {
        MyMeth myMeth = new MyMeth();
        int a = 10;
        int b = 5;

        myMeth.sum(a, b);
        myMeth.difference(a, b);
        myMeth.multiply(a, b);
        myMeth.divide(a, b);
    }
}
