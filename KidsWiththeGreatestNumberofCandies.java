package Leetcode75;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        System.out.println();
        System.out.println("Expected:\t [true,true,true,false,true]");
        System.out.println("Actual:\t\t"+ kidsWithCandies(candies, extraCandies).toString());

    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int max = -1;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        int min = max - extraCandies;
        List<Boolean> result = new ArrayList<Boolean>();

        for (int candy : candies) {
            result.add(min>=candy);
        }
        

        return result;
    }
}
