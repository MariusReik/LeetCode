class Solution {
    public int findClosestNumber(int[] nums) {
        int low = nums[0];

        for (int i = 0; i < nums.length; i++) { 
            if (Math.abs(nums[i]) < Math.abs(low) || 
                (Math.abs(nums[i]) == Math.abs(low) && nums[i] > low)) {
                low = nums[i];
            }
        } 
        return low;
    }
}
