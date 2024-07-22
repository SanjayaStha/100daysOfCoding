
package Leetcode75;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * ReverseVowel
 */
public class ReverseVowel {

    public static void main(String[] args) {

        System.out.println("Expected leotcede");
        System.out.println("Actual " + reverseVowels("leetcode"));
    }

    private static String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            while (left < right && !vowels.contains(chars[left])) {
                left++;
            }
            while (left < right && !vowels.contains(chars[right])) {
                right--;
            }

            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        return new String(chars);
    }
}