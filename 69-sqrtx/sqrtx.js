var mySqrt = function(x) {
    if (x === 0) {
        return 0;
    }

    let x1 = x;
    let x0;
    const epsilon = 1e-10;  // tolerance level

    while (true) {
        x0 = x1;
        x1 = (x0 + x / x0) / 2;

        if (Math.abs(x0 - x1) < epsilon) {
            break;
        }
    }

    return Math.floor(x1);
};