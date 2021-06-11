package oop.assignment2.ex24;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
public class AnagramDetector {
    public boolean isAnagram(String word1, String word2) {

        if(word1.length() != word2.length()) {
            return false;
        }

        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();

        Arrays.sort(w1);
        Arrays.sort(w2);

        return Arrays.equals(w1, w2);

    }
}
