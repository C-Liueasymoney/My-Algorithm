package mirrorTree_27;

import org.junit.Test;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/22 3:03 下午
 */
public class MySolution {

    @Test
    public void test(){
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        TreeNode mirrorTree = mirrorTreeWay(root);
        System.out.println(mirrorTree.left.val);
    }

    public TreeNode mirrorTreeWay(TreeNode root){
        //根节点为空返回
        if (root == null) return root;
        //左或右子节点不为空就进入交换和递归
        if (root.left != null || root.right != null){
            //交换左右子节点
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            //递归的遍历二叉树
            mirrorTreeWay(root.left);
            mirrorTreeWay(root.right);
        }
        return root;
    }
}
