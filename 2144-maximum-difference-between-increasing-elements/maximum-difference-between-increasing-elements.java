class Solution {
    public int maximumDifference(int[] nums) {
        if (nums.length < 2) {
            return -1;
        }
        
        int minElement = nums[0];
        int maxDiff = -1;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > minElement) {
                int currentDiff = nums[i] - minElement;
                if (currentDiff > maxDiff) {
                    maxDiff = currentDiff;
                }
            } else {
                minElement = nums[i];
            }
        }
        
        return maxDiff;
    }
}