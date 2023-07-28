package Top_Interview_150;

class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1};
        int[] nums2 = {};
        merge(nums1, nums1.length-nums2.length,
                nums2, nums2.length);

        System.out.print("[");
        for (int j : nums1) {
            System.out.print(j + " ");
        }
        System.out.println("]");

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // O(n)
        for (int i = n+m-1; i>=n && i-n >= 0; --i) {
            nums1[i] = nums1[i-n];
            if (i != i-n) nums1[i-n] = 0;
        }

        // O(n+m)
        int iter1 = n;
        int iter2 = 0;

        for (int i = 0; i < m + n; ++i) {
            if (iter1 < n+m && iter2 < n) {
                if (nums1[iter1] < nums2[iter2] ) {
                    nums1[i] = nums1[iter1++];
                } else {
                    nums1[i] = nums2[iter2++];
                }
            }
        }

        // O(m)
        if (iter2 <= n) {
            for (int i = m + iter2; i < n + m; ++i) {
                nums1[i] = nums2[iter2++];
            }
        }

    }
}