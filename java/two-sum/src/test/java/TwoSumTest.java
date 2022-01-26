import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TwoSumTest {

    TwoSum twoSum = new TwoSum();

    private static Stream<Arguments> twoSum() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new int[]{0, 1}, new int[]{2, 7, 11, 15}, 9))
                .add(Arguments.of(new int[]{1, 2}, new int[]{3, 2, 4}, 6))
                .add(Arguments.of(new int[]{0, 1}, new int[]{3, 3}, 6))
                .build();
    }

    @ParameterizedTest
    @MethodSource
    void twoSum(int[] expected, int[] nums, int target) {
        int[] actual = twoSum.twoSum(nums, target);
        Assertions.assertArrayEquals(expected, actual);

    }
}
