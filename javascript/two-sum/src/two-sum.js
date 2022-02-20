/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (nums, target) {
  const pastValues = {};
  for (let i = 0; i < nums.length; i++) {
    const element = nums[i];
    const complement = target - element;
    if (complement in pastValues) {
      return [i, pastValues[complement]];
    }
    pastValues[element] = i;
  }

  return [];
};

export default twoSum;
