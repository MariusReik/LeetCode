/**
 * @param {string} s
 * @return {number}
 */
var firstUniqChar = function(s) {

    const charFrequency = new Array(26).fill(0);
    
    for(const character of s ) { 
        charFrequency[character.charCodeAt(0) - 'a'.charCodeAt(0)]++;
    }
    for (let i = 0; i < s.length; i++) {
        if (charFrequency[s.charCodeAt(i) - 'a'.charCodeAt(0)] === 1) {
            return i;
        }
    }
    return -1;
};