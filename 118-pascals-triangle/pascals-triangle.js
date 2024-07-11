/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    if (numRows === 0) {
        return [];
    }

    let result = [[1]];

    for (let i = 1; i < numRows; i++) {
        let prevRow = result[i - 1];
        let newRow = new Array(i + 1);
        newRow[0] = 1;
        newRow[i] = 1;

        for (let j = 1; j < i; j++) {
            newRow[j] = prevRow[j - 1] + prevRow[j];
        }

        result.push(newRow);
    }

    return result;
};
