class Solution {
    public int minTimeToReach(int[][] moveTime) {
        int n = moveTime.length;
        int m = moveTime[0].length;
        
        int[][] minTime = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(minTime[i], Integer.MAX_VALUE);
        }
        minTime[0][0] = 0;
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        pq.offer(new int[]{0, 0, 0}); // {row, col, time}
        
        int[][] dirs = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int row = curr[0], col = curr[1], time = curr[2];
            
            // Skip if we already found a better time for this cell
            if (time > minTime[row][col]) continue;
            
            if (row == n - 1 && col == m - 1) return time;
            
            for (int[] dir : dirs) {
                int newRow = row + dir[0], newCol = col + dir[1];
                
                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m) {
                    int newTime = Math.max(time, moveTime[newRow][newCol]) + 1;
                    
                    if (newTime < minTime[newRow][newCol]) {
                        minTime[newRow][newCol] = newTime;
                        pq.offer(new int[]{newRow, newCol, newTime});
                    }
                }
            }
        }
        
        return -1;
    }
}