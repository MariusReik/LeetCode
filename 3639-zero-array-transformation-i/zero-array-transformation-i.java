class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {

        int n = nums.length;
        
        // Use a difference array to efficiently track the query coverage
        int[] coverage = new int[n + 1];
        
        // Process each query using the difference array technique
        for (int[] query : queries) {
            int left = query[0];
            int right = query[1];
            
            // Increment the start of range
            coverage[left]++;
            
            // Decrement after the end of range
            coverage[right + 1]--;
        }
        
        // Calculate the prefix sum to get the actual coverage for each position
        for (int i = 1; i < n; i++) {
            coverage[i] += coverage[i - 1];
        }
        
        // Check if each element can be reduced to 0
        for (int i = 0; i < n; i++) {
            if (nums[i] > coverage[i]) {
                return false;
            }
        }
        
        return true;
    }
}