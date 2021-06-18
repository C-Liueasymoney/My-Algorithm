package dfs;

/**
 * @Description:深度优先遍历树
 * @Author: chong
 * @Data: 2021/4/17 9:42 下午
 */
public class DFSTest {
    public void DFSWithRecursion(TreeNode root){
        if (root == null)
            return;

        if (root.rightNode != null)
            DFSWithRecursion(root.rightNode);
        if (root.leftNode != null)
            DFSWithRecursion(root.leftNode);
    }
}
