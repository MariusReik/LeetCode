/**
 * @param {string} s
 * @param {string} t
 * @return {number}
 */
var findPermutationDifference = function(s, t) {
    let differenceSum = 0;


    for (let i = 0; i < s.length; i++) {

        const indexInS = i;
        const indexInT = t.indexOf(s[i]);


        differenceSum += Math.abs(indexInS - indexInT);
    }

    return differenceSum;
};