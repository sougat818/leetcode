import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static java.util.Objects.isNull;

class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (isNull(root)) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        do {
            TreeNode current = stack.pop();
            result.add(current.val);
            if (!isNull(current.right)) {
                stack.push(current.right);
            }
            if (!isNull(current.left)) {
                stack.push(current.left);
            }
        } while (!stack.empty());
        return result;
    }

}
