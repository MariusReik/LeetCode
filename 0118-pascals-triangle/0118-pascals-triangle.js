/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    if (numRows === 0) {
        return [];
    }
    if (numRows === 1) {
        return [[1]];
    }

    let preRows = generate(numRows - 1);
    let lastRow = preRows[preRows.length - 1];
    let newRow = new Array(numRows);

    newRow[0] = 1;
    newRow[numRows - 1] = 1;

    for (let i = 1; i < numRows - 1; i++) {
        newRow[i] = lastRow[i - 1] + lastRow[i];
    }

    preRows.push(newRow);
    return preRows;
};
