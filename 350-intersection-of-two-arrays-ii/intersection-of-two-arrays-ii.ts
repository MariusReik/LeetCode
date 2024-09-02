function intersect(numbers1: number[], numbers2: number[]): number[] {
    const numberFrequencyMap = new Map<number, number>();

    for (const number of numbers1) {
        numberFrequencyMap.set(number, (numberFrequencyMap.get(number) ?? 0) + 1);
    }

    const intersectionArray = [];

    for (const number of numbers2) {
        if (numberFrequencyMap.has(number) && numberFrequencyMap.get(number) !== 0) {
            intersectionArray.push(number);
            numberFrequencyMap.set(number, numberFrequencyMap.get(number) - 1);
        }
    }
    return intersectionArray;
}