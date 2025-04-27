class Solution {
    public int countSubarrays(int[] nums) {
        int count = 0;
        for (int i = 0; i + 2 < nums.length; i++) {
            if (2 * (nums[i] + nums[i + 2]) == nums[i + 1] && nums[i + 1] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}