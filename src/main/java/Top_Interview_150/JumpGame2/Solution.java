package Top_Interview_150.JumpGame2;

import java.util.Arrays;

class Solution {
    public int jump(int[] nums) {
        if (nums.length == 1) return 0;

        int[] jumps = new int[nums.length];
        Arrays.fill(jumps, Integer.MAX_VALUE);
        jumps[0] = 0;

        for (int i = 1; i < nums.length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (nums[j] + j >= i)
                    if (jumps[i] > jumps[j] + 1)
                        jumps[i] = jumps[j] + 1;
            }
        }

        return jumps[jumps.length-1];
    }
}
