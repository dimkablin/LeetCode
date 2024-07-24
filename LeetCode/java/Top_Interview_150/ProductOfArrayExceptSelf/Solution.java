package Top_Interview_150.ProductOfArrayExceptSelf;

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];

        int temp = 1;

        for (int i = 0; i < nums.length; ++i) {
            prefix[i] = temp;
            temp *= nums[i];
        }

        temp = 1;
        for (int i = nums.length - 1; i >= 0; --i) {
            postfix[i] = temp;
            temp *= nums[i];
        }

        for (int i = 0; i < nums.length; ++i) {
            nums[i] = prefix[i] * postfix[i];
        }

        return nums;

    }
}
