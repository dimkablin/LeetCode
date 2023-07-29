package Top_Interview_150.RemoveDuplicatesFromSortedArray;

public class RemoveDuplicates {
    public static void main(String[] args) {

    }

    class Solution {
        public int removeDuplicates(int[] nums) {
            int u_num = 1;

            for (int i = 1; i < nums.length; ++i) {
                if (nums[i] != nums[i-1]) {
                    nums[u_num++] = nums[i];
                }
            }

            return u_num;
        }
    }
}
