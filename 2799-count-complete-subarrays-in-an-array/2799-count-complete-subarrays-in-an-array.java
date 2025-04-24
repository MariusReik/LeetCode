import java.util.*;
import java.util.stream.*;

class Solution {
    public int countCompleteSubarrays(int[] nums) {
        long totalDistinct = Arrays.stream(nums).distinct().count();
        int count = 0;
        
        for (int start = 0; start < nums.length; start++) {
            Set<Integer> currentElements = new HashSet<>();
            
            for (int end = start; end < nums.length; end++) {
                currentElements.add(nums[end]);
                
                if (currentElements.size() == totalDistinct) {
                    count++;
                }
                
                if (currentElements.size() > totalDistinct) {
                    break;
                }
            }
        }
        
        return count;
    }
}