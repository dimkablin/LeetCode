package Top_Interview_150.RotateArray;

public class Solution {
    private void reverse(int[] nums, int from, int to) {
        int temp;

        for (int i = from, j = to; i < j; ++i, --j) {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

    public void rotate(int[] nums, int k) {
        k %= nums.length;

        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);

    }
}
