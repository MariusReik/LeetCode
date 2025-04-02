class Solution {
    public int findClosestNumber(int[] nums) {
        int closest = nums[0];
        int currentAbs = Math.abs(closest);
        
        for (int num : nums) {
            if (num == 0) return 0; // Early exit for zero
            
            int absNum = Math.abs(num);
    
            if (absNum < currentAbs || (absNum == currentAbs && num > closest)) {
                closest = num;
                currentAbs = absNum;
            }
        }
        return closest;
    }
}