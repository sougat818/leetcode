import twoSum from "./two-sum";
test("two Sum sample data", () => {
  expect(twoSum([2, 7, 11, 15], 9)).toStrictEqual([1, 0]);
  expect(twoSum([3, 2, 4], 6)).toStrictEqual([2, 1]);
  expect(twoSum([3, 3], 6)).toStrictEqual([1, 0]);
});
