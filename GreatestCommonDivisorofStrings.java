package Leetcode75;

/**
 * GreatestCommonDivisorofStrings
 */
public class GreatestCommonDivisorofStrings {

    public static void main(String[] args) {
        String str1 = "TAUXXTAUXXTAUXXTAUXXTAUXX";
        String str2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";

        String res = gcdOfStrings(str1, str2);

        // assert res.equals("AB");
        System.out.println();
        System.out.println("Expected: \t" + "TAUXX");
        System.out.println("Actual: \t" + res);

    }

    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}