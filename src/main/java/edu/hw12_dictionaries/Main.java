package edu.hw12_dictionaries;

import edu.hw12_dictionaries.myExaptions.FileAlreadyExist;
import edu.hw12_dictionaries.myExaptions.UnavailablePath;

public class Main {
    public static void main(String[] args) {
        FileNavigator fileNavigator = new FileNavigator();
        FileData fileData = new FileData("firstFile", 10000, "folder1/");

        try {
            fileNavigator.add(fileData, "folder1/");
            fileNavigator.add(new FileData("SecondFile", 11000, "folder1/"), "folder1/");
        } catch (UnavailablePath e) {
            System.out.println("Error: " + e.getMessage());
        } catch (FileAlreadyExist e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(fileNavigator.find("folder1/"));
        fileNavigator.remove("folder1/");
        System.out.println(fileNavigator.filterBySize(10100));
        System.out.println(fileNavigator.sortBySize());

    }
}
