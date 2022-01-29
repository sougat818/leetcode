import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


public class BinaryTreePreorderTraversalTest {

  BinaryTreePreorderTraversal binaryTreePreorderTraversal = new BinaryTreePreorderTraversal();

  private static Stream<Arguments> preorderTraversal() {
    return Stream.<Arguments>builder()
      .add(Arguments.of(List.of(1, 2, 3),
        new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null))))
      .add(Arguments.of(List.of(), null))
      .add(Arguments.of(List.of(1), new TreeNode(1, null, null)))
      .build();
  }

  @ParameterizedTest
  @MethodSource
  void preorderTraversal(List<Integer> expected, TreeNode root) {
    List<Integer> actual = binaryTreePreorderTraversal.preorderTraversal(root);
    assertTrue(actual.size() == expected.size() &&
      actual.containsAll(expected) && expected.containsAll(actual));
  }

}

