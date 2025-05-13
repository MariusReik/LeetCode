class Solution {
    public int lengthAfterTransformations(String s, long t) {
        // Define the modulo value
        final int MOD = 1_000_000_007;

        
        // Count the occurrences of each character in the string
        long[] counts = new long[26]; // a-z
        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }
        
        // Perform transformations t times
        for (long i = 0; i < t; i++) {
            long[] newCounts = new long[26];
            
            // Apply transformations for each character
            for (int j = 0; j < 26; j++) {
                if (j == 25) { // if it's 'z'
                    // 'z' transforms to "ab"
                    newCounts[0] = (newCounts[0] + counts[j]) % MOD; // add 'a's
                    newCounts[1] = (newCounts[1] + counts[j]) % MOD; // add 'b's
                } else {
                    // Other characters transform to the next character in the alphabet
                    newCounts[j + 1] = (newCounts[j + 1] + counts[j]) % MOD;
                }
            }
            
            // Update the counts for the next transformation
            counts = newCounts;
        }
        
        // Calculate the final length by summing all character counts
        long totalLength = 0;
        for (long count : counts) {
            totalLength = (totalLength + count) % MOD;
        }
        
        return (int) totalLength;
    }
}