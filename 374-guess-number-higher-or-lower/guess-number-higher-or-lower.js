/** 
 * Forward declaration of guess API.
 * @param {number} num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * var guess = function(num) {}
 */

/**
 * @param {number} n
 * @return {number}
 */
var guessNumber = function(n) {
    
    let left = 1;
    let right = n;

    // Use binary search to find the guessed number
    while (left < right) {

        const mid = left + ((right - left) >>> 1);

        const result = guess(mid);
        if (result <= 0) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }
    return left;
};