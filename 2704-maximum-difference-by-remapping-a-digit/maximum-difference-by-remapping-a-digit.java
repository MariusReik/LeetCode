class Solution {
    public int minMaxDifference(int num) {
        String numStr = String.valueOf(num);
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;

        for (char from = '0'; from <= '9'; from++) {
            for (char to = '0'; to <= '9'; to++) {
                if (from == to) continue;

                String remapped = numStr.replace(from, to);
                int value = Integer.parseInt(remapped);
                maxVal = Math.max(maxVal, value);
                minVal = Math.min(minVal, value);
            }
        }

        return maxVal - minVal;
    }
}
