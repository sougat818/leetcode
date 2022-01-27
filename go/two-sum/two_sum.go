package two_sum

func twoSum(nums []int, target int) []int {
	possibleValues := make(map[int]int)
	for i, currentValue := range nums {
		if val, ok := possibleValues[target-currentValue]; ok {
			return []int{i, val}
		} else {
			possibleValues[currentValue] = i
		}
	}
	return []int{0, 0}
}
