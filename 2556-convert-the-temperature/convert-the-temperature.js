/**
 * @param {number} celsius
 * @return {number[]}
 */
var convertTemperature = function(celsius) {
  
    let kelvin = celsius + 273.15;
    let fahren = celsius * 1.80 + 32.00   
    let number = [kelvin, fahren];
    return number;
};