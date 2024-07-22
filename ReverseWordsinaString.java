package Leetcode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;

public class ReverseWordsinaString {

    public static void main(String[] args) {

        String s = "a good   example";

        System.out.println("Expected: " + "example good a");
        System.out.println("Actual: " + reverseWords2(s));
    }

    // private static String reverseWords(String s) {

    //     String[] sArr = s.split(" ");

    //     StringBuilder strArr = new StringBuilder();

    //     for (int i = sArr.length - 1; i >= 0; i--) {

    //         String str = sArr[i];

    //         if (!str.isBlank() || !str.isEmpty()) {
    //             strArr.append(str.trim());
    //             strArr.append(" ");
    //         }
    //     }

    //     return strArr.toString().trim();
    // }

    private static String reverseWords(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        String[] words = s.trim().split("\\s+");
        StringJoiner reversed = new StringJoiner(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.add(words[i]);
        }

        return reversed.toString();
    }
}
