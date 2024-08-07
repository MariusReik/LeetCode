/**
 * @param {number[]} nums
 * @param {number} k
 * @return {boolean}
 */
var containsNearbyDuplicate = function(nums, k) {
    
    const indexMap = new Map();
    
    for (let i = 0; i < nums.length; i++) {
        const num = nums[i];
        
        if (indexMap.has(num) && (i - indexMap.get(num) <= k)) {
            return true; 
        }
        
        indexMap.set(num, i);
    }
    
    return false;
};