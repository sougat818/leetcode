from pip import List


class TwoSum:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        past_values = {}

        for i in range(len(nums)):
            compliment = target-nums[i]
            if compliment in past_values:
                return [i, past_values[compliment]]
            past_values[nums[i]] = i
        return []
