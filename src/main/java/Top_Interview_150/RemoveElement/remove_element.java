package Top_Interview_150.RemoveElement;

class Solution {
    public static void main(String[] args) {

    }

    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; ++i) {
            nums[i-k] = nums[i];
            if (nums[i] == val) k++;
        }

        return nums.length - k;
    }
}