class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;     // negative or zero → false
        if (n == 1) return true;      // 2^0 = 1
        if (n % 2 != 0) return false; // odd → false
        if (n == 2) return true;      // base case 2^1 = 2
        
        return isPowerOfTwo(n / 2);   // return recursive result
    }
}
