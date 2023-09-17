package edu.hw11_collection;

import edu.hw11_collection.phonebook.Directory;
import edu.hw11_collection.phonebook.Note;

import javax.crypto.spec.PSource;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Methods methods = new Methods();

        System.out.println("1-----------------------------------");
        List<String> listOfStr = new ArrayList<>();
        listOfStr.add("Hello");
        listOfStr.add("Hello");
        listOfStr.add("world");
        listOfStr.add("world");
        listOfStr.add("world");
        listOfStr.add("!");

        methods.countOccurance(listOfStr, "Hello");
        methods.countOccurance(listOfStr, "world");

        System.out.println("2-----------------------------------");
        Integer[] intArr = {1, 2, 3, 3, 3, 6, 6, 8, 9, 10};
        String[] strArr = {"Hello", "World", "!"};

        List<Integer> listedIntArr = methods.toList(intArr);
        List<String> listedStrArr = methods.toList(strArr);
        System.out.println(listedIntArr);
        System.out.println(listedStrArr);

        System.out.println("3-----------------------------------");
        List<Integer> uniqueList = methods.findUnique(listedIntArr);
        System.out.println(uniqueList);

        List<String> listOfStr2 = Arrays.asList("Dog", "Dog", "Dog", "Cat", "Fish", "Fish", "Cow", "sheep", "sheep", "sheep","sheep", "Pig", "Pig");

        System.out.println("4-----------------------------------");
        methods.calcOccurance(listOfStr2);

        System.out.println("5-----------------------------------");
        System.out.println(methods.findOccurance(listOfStr2));

        System.out.println("6-----------------------------------");
        Directory records = new Directory();

        records.add(new Note("Soul", "505 503 4455"));
        records.add(new Note("Soul", "616 614 5566"));
        records.add(new Note("Marty McFly", "067 962 4793"));
        records.add(new Note("Hermiona Granger", "098 776 8090"));

        System.out.println(records.find("Soul"));
        System.out.println(records.find("Juls"));
        System.out.println(records.findAll("Soul"));
    }
}
