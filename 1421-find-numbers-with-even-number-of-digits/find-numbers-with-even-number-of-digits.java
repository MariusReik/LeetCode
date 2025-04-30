class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int digitCount = 0;
            int temp = num;
            if (temp == 0) {
                digitCount = 1;
            } else {
                while (temp != 0) {
                    temp /= 10;
                    digitCount++;
                }
            }
            if (digitCount % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}