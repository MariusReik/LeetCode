class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        char [] jel = jewels.toCharArray();
        char [] sto = stones.toCharArray();
        int count = 0;

        if(stones.length() < 1 || jewels.length() < 1){ 
            return count;
        }

        for(int i = 0; i < stones.length(); i++){ 
            for(int j = 0; j < jewels.length(); j++){
                if(sto[i] == jel[j]){
                    count++;
                }

            }
        }
        return count;
    }
}