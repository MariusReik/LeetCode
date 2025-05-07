class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int val : gifts) { 
            maxHeap.add(val);
        }
        while(k > 0){ 
            int val = maxHeap.poll();
            int rem = (int) Math.floor(Math.sqrt(val)); 
            maxHeap.add(rem);
            k--;
        }
        long ans = 0; 
        while(!maxHeap.isEmpty()){ 
            ans += maxHeap.poll();
        }
        return ans;
    }
}