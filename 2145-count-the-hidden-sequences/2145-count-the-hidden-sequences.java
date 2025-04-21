class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        // Use long to prevent integer overflow in edge cases
        long sum = 0;       // cumulative sum of differences
        long min = 0;       // track the minimum cumulative sum reached
        long max = 0;       // track the maximum cumulative sum reached

        // Loop through the differences array to calculate prefix sums
        for (int diff : differences) {
            sum += diff;                // update the cumulative sum
            min = Math.min(min, sum);   // update the minimum prefix sum seen so far
            max = Math.max(max, sum);   // update the maximum prefix sum seen so far
        }

        // The valid starting values (start) must keep all elements within bounds.
        long validStarts = (upper - lower) - (max - min) + 1;

        // If the range is negative, there are no valid arrays
        return (int) Math.max(0, validStarts);
    }
}
