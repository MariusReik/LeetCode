function removeElement(nums: number[], val: number): number {
    if (nums.length === 0) {
        return 0;
    }

    let index = 0;
    let pos = 0;

    while (index !== nums.length) {
        if (nums[index] !== val) {
            nums[pos] = nums[index];
            pos += 1;
        }

        index += 1;
    }
    
    return pos;
};