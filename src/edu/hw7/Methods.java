package edu.hw7;

import java.util.Random;
import java.util.Scanner;

public class Methods {
//    1
    public static void findSymbolOccurance(String speech, char symbol) {
        System.out.println("---------------------------------");
        int symbolCounter = 0;
        for (int  i = 0; i < speech.length(); i++) {
            if (speech.charAt(i) == symbol) {
                symbolCounter++;
            }
        }
        System.out.println("Amount of \"" + symbol + "\": " + symbolCounter);
    }

    public static void findWordPosition(String source, String target) {
        System.out.println("---------------------------------");
        int position = source.indexOf(target);
        if (position != -1) {
            System.out.println("Founded on position: " + position);
        } else {
            System.out.println("Not founded " + position);
        }
    }

    public static void reversedString(String speech) {
        System.out.println("---------------------------------");
        StringBuilder reversedStr = new StringBuilder(speech);
        reversedStr.reverse();
        System.out.println(reversedStr);
    }

    public static void isPalendrom(String word) {
        System.out.println("---------------------------------");
        StringBuilder reversedStr = new StringBuilder(word);
        reversedStr.reverse();
        System.out.println(word + " --> " + reversedStr);
        if (reversedStr.toString().equals(word)){
            System.out.println("The word is a palendrom");
        } else {
            System.out.println("The word is not a palendrom");
        }
    }

    public static void game() {
        System.out.println("--------------------------------");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String answer;

        //output the hide word
        int randWordIndex = random.nextInt(words.length);
        StringBuilder randWord = new StringBuilder(words[randWordIndex]);
        StringBuilder hideWord = new StringBuilder();
        hideWord.append(randWord.charAt(0));
        for (int i = 1; i < randWord.length(); i++) {
            hideWord.append("#");
        }
        System.out.println(hideWord);

        //player answer
        for (int i = 0; i < 3; i++) {
                System.out.println("Enter hided word: ");
                answer = scanner.nextLine();
                if (answer.equals(randWord.toString())) {
                    System.out.println("You guessed!");
                    break;
                } else {
                    System.out.println("Warning");
                }
        }
    }
}
