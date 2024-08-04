/**
 * @param {number[]} nums
 * @return {number}
 */
var minimumOperations = function(nums) {
    
    let operations = 0;

    for (let num of nums) {
        let remainder = num % 3;
        if (remainder === 1) {
            operations += 1;  // Subtract 1 to make it divisible by 3
        } else if (remainder === 2) {
            operations += 1;  // Add 1 to make it divisible by 3
        }
    }

    return operations;
}

