class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] count = new int[1000];
        int result = 0;
        for(int[] domino : dominoes){ 
            int a = domino[0], b = domino[1]; 

            int key;
            if (a < b) {
                key = a * 10 + b;  // If a < b, key = "ab" (e.g., [1,2] → 12)
            } else {
                key = b * 10 + a;  // Else, key = "ba" (e.g., [2,1] → 12)
            }
            result += count[key]; 
            count[key]++;
        }
        return result;
    }
}