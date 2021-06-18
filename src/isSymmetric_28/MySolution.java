package isSymmetric_28;


/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/22 7:38 下午
 */
public class MySolution {
    public boolean isSymmetricWay(TreeNode root){
        if (root == null) return true;
        return recur(root.left, root.right);
    }

    public boolean recur(TreeNode root1, TreeNode root2){
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        if (root1.val != root2.val) return false;

        return recur(root1.left, root2.right) && recur(root1.right, root2.left);
    }
}
