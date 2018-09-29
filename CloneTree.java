375. 克隆二叉树

深度复制一个二叉树。

给定一个二叉树，返回一个他的 克隆品 。

样例

给定一个二叉树：

     1
   /  \
  2    3
 / \
4   5
返回其相同结构相同数值的克隆二叉树：

     1
   /  \
  2    3
 / \
4   5




/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */

public class CloneTree {
    /**
     * @param root: The root of binary tree
     * @return: root of new tree
     */
    public TreeNode cloneTree(TreeNode root) {
        // write your code here
        if (root == null)
            return null;
        TreeNode res = new TreeNode(root.val);
        res.left = cloneTree(root.left);
        res.right = cloneTree(root.right);
        return res;
    }
}