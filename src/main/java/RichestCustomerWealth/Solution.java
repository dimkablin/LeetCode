package RichestCustomerWealth;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][]{{1, 2, 3}, {1, 2, 5}}));
    }

    public static int maximumWealth(int[][] accounts) {

        // if (accounts.length == 0) return 0;

        int max = 0;
        int temp;
        for (int i = 0; i < accounts.length; i++) {
            temp = 0;
            for(int j = 0; j < accounts[i].length; j++) {
                temp += accounts[i][j];
            }
            if(temp > max) {
                max = temp;
            }
        }
        return max;
    }
}
