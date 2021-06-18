package mirrorTree_27;

import org.junit.Test;

import java.util.LinkedList;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/22 3:36 下午
 */
public class OfficialSolution {

    public TreeNode mirrorTreeWay(TreeNode root){
        if (root == null) return root;
        //用linkedlist充当栈
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.addFirst(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.removeFirst();
            if (node.left != null) stack.addFirst(node.left);
            if (node.right != null) stack.addFirst(node.right);
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
        return root;
    }
}
