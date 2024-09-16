/**
 * @param {number} num
 * @return {boolean}
 */
var isPerfectSquare = function(num) {
    
    let left = 1;
        let right = num >> 1; 

        while (left < right) {

            const mid = (left + right) >>> 1;

            if (mid * mid < num) {
                left = mid + 1; 
            } else {
                right = mid; 
            }
        }

        return left * left === num;
    
};