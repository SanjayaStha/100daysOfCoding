


package Leetcode75;

import java.util.ArrayList;

/**
 * MergeStringAlternatively
 */
public class MergeStringAlternatively {

    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";
        String exp = "apbqrs";

        String res = mergeString(word1, word2);
        System.out.println();
        System.out.println("Actual: "+ res);
        System.out.println("Exp: "+ exp);

    }

    private static String mergeString(String word1, String word2) {
       

        if(word1.isEmpty()) return word2;
        if(word2.isEmpty()) return word1;

        int length = Math.max(word1.length(), word2.length());

        StringBuilder finalString = new StringBuilder();


        for (int index = 0; index < length; index++) {
            if(index<word1.length()) finalString.append(word1.charAt(index));
            if(index<word2.length()) finalString.append(word2.charAt(index));
        }

        return finalString.toString();

    }

}