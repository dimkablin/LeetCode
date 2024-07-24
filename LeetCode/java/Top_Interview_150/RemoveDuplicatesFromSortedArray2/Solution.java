package Top_Interview_150.RemoveDuplicatesFromSortedArray2;

public class Solution {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 2, 3, 3};
        int k = removeDuplicates(array);

        System.out.println(k);
        for (int i = 0; i < k; ++i) {
            System.out.printf("%d ", array[i]);
        }
    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int p_num = 0;

        for (int i = 2; i < nums.length; ++i) {
            if (p_num != 0)
                nums[i-p_num] = nums[i];

            if (nums[i-p_num] == nums[i-2-p_num]) {
                ++p_num;
            }
        }
        return nums.length - p_num;
    }
}