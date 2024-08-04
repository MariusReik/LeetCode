/**
 * @param {number[]} nums
 * @return {number}
 */
var minimumOperations = function(nums) {
 
    return nums.reduce((operations, num) => {
        let remainder = num % 3;
        return operations + (remainder === 0 ? 0 : 1);
    }, 0);


};