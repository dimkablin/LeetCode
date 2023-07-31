package Top_Interview_150.JumpGame2;

import java.util.Arrays;

class Solution {
    public int jump(int[] nums) {
        if (nums.length == 1) return 0;

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + i > nums[i-1] ? nums[i] + i : nums[i-1];
        }

        int i = 1, ind = 0;

        while ((ind = nums[ind]) < nums.length-1)
            i++;

        return i;
    }
}
