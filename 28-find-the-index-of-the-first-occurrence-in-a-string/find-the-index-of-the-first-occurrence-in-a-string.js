var strStr = function(haystack, needle) {
    if (needle.length === 0) {
        return 0; 
    }
    
    let haystackLength = haystack.length;
    let needleLength = needle.length;

    // Loop through haystack, but stop where the remaining substring is shorter than needle
    for (let i = 0; i <= haystackLength - needleLength; i++) {
        let j = 0;
        
        // Check if the substring starting at index i matches needle
        while (j < needleLength && haystack[i + j] === needle[j]) {
            j++;
        }
        
        // return the starting index
        if (j === needleLength) {
            return i;
        }
    }
    
    return -1; 
};