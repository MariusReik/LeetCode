/**
 * @param {string[]} dictionary
 * @param {string} sentence
 * @return {string}
 */
var replaceWords = function(dictionary, sentence) { 
    
    const dictSet = new Set(dictionary);
    const findRoot = (word) => {
        for (let i = 1; i <= word.length; i++) {
            const prefix = word.slice(0, i);
            if (dictSet.has(prefix)) {
                return prefix;
            }
        }
        return word;
    };

    const words = sentence.split(' ');
    const result = words.map(word => findRoot(word));
    
    return result.join(' ');
}
