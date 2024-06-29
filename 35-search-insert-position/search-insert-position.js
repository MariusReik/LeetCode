/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target) {

    let counter = 0;
    for(let i = 0; i < nums.length; i++){ 
        if(nums[i] === target || nums[i] > target){ 
        return i;
    }
   } 
   return nums.length;
};