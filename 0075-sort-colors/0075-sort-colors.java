class Solution {
    public void sortColors(int[] nums) {
        int red = 0, blue = 0, green = 0;

        // Count occurrences of 0, 1, and 2
        for (int num : nums) {
            switch (num) {
                case 0: red++; break;
                case 1: blue++; break;
                case 2: green++; break;
            }
        }

        // Overwrite nums with sorted values
        int i = 0;
        while (red-- > 0) nums[i++] = 0;
        while (blue-- > 0) nums[i++] = 1;
        while (green-- > 0) nums[i++] = 2;
    }
}
