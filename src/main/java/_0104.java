import helpers.TreeNode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/maximum-depth-of-binary-tree
public class _0104 {
    public int maxDepth(TreeNode root) {
        int depth = 0;
        if (root != null) {
            List<TreeNode> nodesAtlevel = new ArrayList<>();
            nodesAtlevel.add(root);

            while (!nodesAtlevel.isEmpty()) {
                depth++;
                List<TreeNode> temp = new ArrayList<>();

                for (TreeNode node : nodesAtlevel) {
                    if (node.left != null) {
                        temp.add(node.left);
                    }
                    if (node.right != null) {
                        temp.add(node.right);
                    }
                }

                nodesAtlevel = temp;
            }
        }

        return depth;
    }

    public int maxDepth1(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth1(root.left), maxDepth1((root.right)));
    }

    public static void main(String[] args) {
        _0104 solution = new _0104();
        System.out.println(solution.maxDepth(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
    }
}
