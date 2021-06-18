package maxDepth_55_1;


import org.junit.Test;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/5/29 10:45 上午
 */
public class MySolution {
    int res = 0;
    public int maxDepthWay(TreeNode root) {
        recur(root, 0);
        return res;
    }

    public void recur(TreeNode root, int k){
        if (root == null)
            return;
        k++;
        if (k > res)
            res = k;
        recur(root.leftNode, k);
        recur(root.rightNode, k);
    }

    @Test
    public void test(){
        TreeNode root = new TreeNode(3);
        root.leftNode = new TreeNode(9);
        root.rightNode = new TreeNode(20);
        root.rightNode.leftNode = new TreeNode(15);
        root.rightNode.rightNode = new TreeNode(5);
        int i = maxDepthWay(root);
        System.out.println(i);
    }
}
