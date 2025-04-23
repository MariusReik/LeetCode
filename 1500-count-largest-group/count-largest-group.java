class Solution {
    public int countLargestGroup(int n) {
        // Use a map to store the count of numbers with each digit sum
        Map<Integer, Integer> digitSumCount = new HashMap<>();
        
        // Calculate digit sum for each number from 1 to n
        for (int i = 1; i <= n; i++) {
            int digitSum = getDigitSum(i);
            digitSumCount.put(digitSum, digitSumCount.getOrDefault(digitSum, 0) + 1);
        }
        
        // Find the maximum group size
        int maxSize = 0;
        for (int count : digitSumCount.values()) {
            maxSize = Math.max(maxSize, count);
        }
        
        // Count how many groups have the maximum size
        int result = 0;
        for (int count : digitSumCount.values()) {
            if (count == maxSize) {
                result++;
            }
        }
        
        return result;
    }
    
    // Helper method to calculate the sum of digits in a number
    private int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}