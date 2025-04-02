class Solution {
    public int findClosestNumber(int[] nums) {
        int closest = nums[0];

        for (int num : nums) {
            int absNum = Math.abs(num);
            int absClosest = Math.abs(closest);

            // Immediate return if we find zero (best possible answer)
            if (num == 0) return 0;

            if (absNum < absClosest || (absNum == absClosest && num > closest)) {
                closest = num;
            }
        }
        return closest;
    }
}
