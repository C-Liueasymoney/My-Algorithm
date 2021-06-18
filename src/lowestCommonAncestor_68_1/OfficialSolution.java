package lowestCommonAncestor_68_1;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/6/3 4:57 下午
 */
public class OfficialSolution {
    public TreeNode lowestCommonAncestorWay(TreeNode root, TreeNode p, TreeNode q){
        while (root != null){
            if (p.val > root.val && q.val > root.val)
                root = root.right;
            else if (p.val < root.val && q.val < root.val)
                root = root.left;
            else
                break;
        }
        return root;
    }
}
