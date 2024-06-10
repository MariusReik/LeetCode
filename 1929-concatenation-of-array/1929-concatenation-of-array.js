/**
 * @param {number[]} nums
 * @return {number[]}
 */
var getConcatenation = function(nums) {
    
    let ans = [...nums];
    const length = ans.length; 
    for (let i = 0; i < length; i++)
    {
        ans[length + i] = nums[i];
    }
    return ans; 

};