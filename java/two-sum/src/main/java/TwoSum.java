import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> possibleValues = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentValue = nums[i];
            if (possibleValues.containsKey(currentValue)) {
                return new int[]{possibleValues.get(currentValue), i};
            } else {
                possibleValues.put(target - currentValue, i);
            }
        }
        throw new IllegalArgumentException("No two sum solution");

    }

}
