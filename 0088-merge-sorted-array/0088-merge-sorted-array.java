class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;         // last element in nums1's original data
        int j = n - 1;         // last element in nums2
        int k = m + n - 1;     // last index of nums1 (including extra space)

        // Fill nums1 from the back
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If nums2 has leftovers, copy them
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

    }
}
