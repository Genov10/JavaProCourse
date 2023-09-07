package edu.hw7_String;

public class Main {
    public static void main(String[] args) {
        Methods methods = new Methods();

        String speech = "A speech with some symbols";
        char symbol = 's';
        String target1 = "ith some";
        String target2 = "asdfghjkl";
        String word1 = "abc";
        String word2 = "tenet";
        methods.findSymbolOccurance(speech, symbol);
        Methods.findWordPosition(speech, target1);
        methods.findWordPosition(speech, target2);
        Methods.reversedString(speech);
        Methods.isPalendrom(word1);
        Methods.isPalendrom(word2);
        Methods.game();
    }
}
