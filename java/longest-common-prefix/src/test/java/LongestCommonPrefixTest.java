import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class LongestCommonPrefixTest {

  LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

  private static Stream<Arguments> longestCommonPrefix() {
    return Stream.<Arguments>builder()
        .add(Arguments.of("fl", new String[]{"flower", "flow", "flight"}))
        .add(Arguments.of("", new String[]{"dog", "racecar", "car"}))
        .add(Arguments.of("a", new String[]{"ab", "a"}))
        .build();
  }

  @ParameterizedTest
  @MethodSource
  void longestCommonPrefix(String expected, String[] strs) {
    String actual = longestCommonPrefix.longestCommonPrefix(strs);
    Assertions.assertEquals(expected, actual);

  }
}
