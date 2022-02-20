function twoSum(nums: number[], target: number): number[] {
  const pastValues = new Map<number, number>();
  for (let i = 0; i < nums.length; i++) {
    const element = nums[i];
    const complement = target - element;
    if (pastValues.has(complement)) {
      return [i, pastValues.get(complement)!];
    }
    pastValues.set(element, i);
  }

  return [];
}
export default twoSum;
