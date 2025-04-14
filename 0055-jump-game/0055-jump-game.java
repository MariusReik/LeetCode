class Solution {
    public boolean canJump(int[] nums) {
        
        int farthest = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > farthest) return false; // we can't reach this point
            farthest = Math.max(farthest, i + nums[i]);
            if (farthest >= nums.length - 1) return true; // we can reach the end
        }

        return true;
    }
}
