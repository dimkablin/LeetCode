package Top_Interview_75.TheKWeakestRowsInAMatrix;

public class Solution {
    public static void main(String[] args) {
        kWeakestRows(new int[][]{
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}}, 3);
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        int length = mat.length;
        int[] sum = new int[length];
        for (int i = 0; i < length; ++i) {
            int count_i = 0;
            for (int j = 0; j < mat[i].length; ++j) {
                count_i += mat[i][j];
            }
            sum[i] = count_i;
        }
        int[] result = new int[k];
        for (int i = 0; i < k; ++i) {
            int min_i = 0;
            for (int j = 0; j < length; ++j) {
                if (sum[j]<sum[min_i]) {
                    min_i = j;
                }
            }
            result[i] = min_i;
            sum[min_i] = Integer.MAX_VALUE;

        }
        return result;
    }
}
