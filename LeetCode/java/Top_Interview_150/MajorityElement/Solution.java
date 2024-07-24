package Top_Interview_150.MajorityElement;

class Solution {
    public int majorityElement(int[] nums) {
        int major = nums[0];
        int count = 0;
        for (int num : nums) {
            if (major == num)
                ++count;
            else
                --count;
            if (count < 0) {
                major = num;
                count = 0;
            }
        }

        return major;
    }
}
