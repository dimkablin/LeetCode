package Top_Interview_150.HIndex;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int h = hIndex(new int[] {1, 3, 1});
        System.out.println(h);
    }
    public static int hIndex(int[] citations) {
        int h = 0;
        Arrays.sort(citations);

        int i = 0;
        for (; i < citations.length; ++i) {
            if (i + 1 > citations[citations.length - i - 1])
                return i;
        }

        return i;
    }
}
