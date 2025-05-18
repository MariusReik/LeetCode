class Solution {
    static final int MOD = 1_000_000_007;

    public int colorTheGrid(int m, int n) {
        List<int[]> validRows = new ArrayList<>();
        generateValidRows(m, 0, new int[m], validRows);

        Map<String, Integer> rowToIndex = new HashMap<>();
        for (int i = 0; i < validRows.size(); i++) {
            rowToIndex.put(Arrays.toString(validRows.get(i)), i);
        }

        int size = validRows.size();
        int[][] compatible = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (isCompatible(validRows.get(i), validRows.get(j))) {
                    compatible[i][j] = 1;
                }
            }
        }

        long[] dp = new long[size];
        Arrays.fill(dp, 1);

        for (int col = 1; col < n; col++) {
            long[] next = new long[size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (compatible[i][j] == 1) {
                        next[j] = (next[j] + dp[i]) % MOD;
                    }
                }
            }
            dp = next;
        }

        long result = 0;
        for (long val : dp) {
            result = (result + val) % MOD;
        }
        return (int) result;
    }

    private void generateValidRows(int m, int pos, int[] row, List<int[]> result) {
        if (pos == m) {
            result.add(row.clone());
            return;
        }

        for (int color = 0; color < 3; color++) {
            if (pos > 0 && row[pos - 1] == color) continue;
            row[pos] = color;
            generateValidRows(m, pos + 1, row, result);
        }
    }

    private boolean isCompatible(int[] row1, int[] row2) {
        for (int i = 0; i < row1.length; i++) {
            if (row1[i] == row2[i]) return false;
        }
        return true;
    }
}
