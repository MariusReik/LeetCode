class Solution {
    public long countSubarrays(int[] nums, int k) {
        
        int max = Arrays.stream(nums).max().getAsInt();
        int count = 0, left = 0, maxFound = 0, n = nums.length;
        long result = 0;

        for (int right = 0; right < n; right++) {
            if (nums[right] == max) {
                maxFound++;
            }
            while (maxFound >= k) {
                result += n - right;
                if (nums[left] == max) {
                    maxFound--;
                }
                left++;
            }
        }
        return result;
    }
}