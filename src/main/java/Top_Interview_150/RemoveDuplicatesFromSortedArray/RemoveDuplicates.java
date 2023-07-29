package Top_Interview_150.RemoveDuplicatesFromSortedArray;

public class RemoveDuplicates {
    public static void main(String[] args) {

    }

    static class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length == 1) return 1;

            int d_num = 0, index = 0;

            for (int i = 1; i < nums.length; ++i) {
                if (nums[i] == nums[index]) {
                    nums[i-d_num] = nums[i];
                    ++d_num;
                } else {
                    ++index;
                    nums[index] = nums[i];
                }
            }


            return nums.length - d_num;
        }
    }
}
