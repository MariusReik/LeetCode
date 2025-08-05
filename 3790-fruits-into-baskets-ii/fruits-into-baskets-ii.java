class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length; // Number of fruit types (assuming fruits and baskets are of same length)
        
        // Boolean array to track which baskets have already been used
        boolean[] used = new boolean[n];  

        int unplaced = 0; // Counter to keep track of fruits that couldn't be placed

        // Loop over each fruit type
        for (int i = 0; i < n; i++) {
            boolean placed = false; // Flag to check if the current fruit is placed

            // Try to find a suitable basket for the current fruit
            for (int j = 0; j < n; j++) {
                // If basket is not used and has enough capacity
                if (!used[j] && baskets[j] >= fruits[i]) {
                    used[j] = true;   // Mark the basket as used
                    placed = true;    // Mark the fruit as placed
                    break;            // No need to check other baskets for this fruit
                }
            }

            // If no suitable basket was found, increment the unplaced counter
            if (!placed) {
                unplaced++;
            }
        }

        // Return the total number of unplaced fruits
        return unplaced;
    }
}

