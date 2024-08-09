class Solution {
    // Helper method
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Helper method
    private int firstDigit(int n) {
        while (n >= 10) {
            n /= 10;
        }
        return n;
    }

    // Helper method 
    private int lastDigit(int n) {
        return n % 10;
    }

    // Main method
    public int countBeautifulPairs(int[] nums) {
        int beautifulPairs = 0;

        for (int i = 0; i < nums.length; i++) {
            int firstI = firstDigit(nums[i]);
            for (int j = i + 1; j < nums.length; j++) {
                int lastJ = lastDigit(nums[j]);
                if (gcd(firstI, lastJ) == 1) {
                    beautifulPairs++;
                }
            }
        }

        return beautifulPairs;
    }
}
