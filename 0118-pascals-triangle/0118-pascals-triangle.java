
class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows <= 0) return new ArrayList<>();
        
        List<List<Integer>> triangle = new ArrayList<>();
        buildTriangle(triangle, numRows, 0);
        return triangle;
    }
    
    private void buildTriangle(List<List<Integer>> triangle, int totalRows, int currentRow) {
        // Base case
        if(currentRow >= totalRows) return;
        
        // Build current row
        List<Integer> row = new ArrayList<>();
        for(int i = 0; i <= currentRow; i++) {
            if(i == 0 || i == currentRow) {
                row.add(1);
            } else {
                // Get previous row and sum adjacent elements
                List<Integer> prevRow = triangle.get(currentRow - 1);
                row.add(prevRow.get(i - 1) + prevRow.get(i));
            }
        }
        
        triangle.add(row);
        
        // Recursive call for next row
        buildTriangle(triangle, totalRows, currentRow + 1);
    }
}