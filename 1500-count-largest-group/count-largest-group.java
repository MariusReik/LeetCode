class Solution {
    public int countLargestGroup(int n) {
        // Since n is at most 10^4, the maximum digit sum is 9+9+9+9 = 36
        int[] counts = new int[37]; // Use array instead of HashMap for better performance
        int maxCount = 0;
        int maxSize = 0;
        
        for (int i = 1; i <= n; i++) {
            // Calculate digit sum directly
            int num = i;
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            
            counts[sum]++;
            
            // Update maximum size and count in one pass
            if (counts[sum] > maxSize) {
                maxSize = counts[sum];
                maxCount = 1;
            } else if (counts[sum] == maxSize) {
                maxCount++;
            }
        }
        
        return maxCount;
    }
}