package lowestCommonAncestor_68_2;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/6/3 11:13 下午
 */
public class MySolution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;
        if (root == p || root == q)
            return root;

        TreeNode leftNode = lowestCommonAncestor(root.left, p, q);
        TreeNode rightNode = lowestCommonAncestor(root.right, p, q);
        if (leftNode == null && rightNode == null)
            return null;
        else if (leftNode != null && rightNode != null)
            return root;
        else if (leftNode == null && rightNode != null)
            return rightNode;
        else
            return leftNode;
    }
}
