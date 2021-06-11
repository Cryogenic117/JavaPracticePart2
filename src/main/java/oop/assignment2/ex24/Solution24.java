package oop.assignment2.ex24;
import java.util.Arrays;
import java.util.Scanner;

public class Solution24 {
    private static final Scanner in = new Scanner(System.in);

    private static String word1;
    private static String word2;

    public static void main(String[] args) {
        readUserInput();

        AnagramDetector ad = new AnagramDetector();
        boolean result = ad.isAnagram(word1, word2);

        String output = generateOutput(result);

        System.out.println(output);
    }

    public static void readUserInput() {
        System.out.print("Enter word 1: ");
        word1 = in.next();

        System.out.print("Enter word 2: ");
        word2 = in.next();
    }

    public static String generateOutput(boolean isAnagram) {
        if(isAnagram){
            return word1 + " and " + word2 +" are anagrams";
        }
        else {
            return word1 + " and " + word2 +" are not anagrams";
        }
    }
}