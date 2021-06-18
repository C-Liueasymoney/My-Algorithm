package kthLargest_54;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * 中序遍历一个搜索二叉树，所得出的数组是从小到大排序的
 * @Author: chong
 * @Data: 2021/5/29 9:56 上午
 */
public class MySolution {
    public int kthLargestWay(TreeNode root, int k) {
        if (root == null)
            return 0;
        List<TreeNode> list = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        do {
            while (root != null){
                stack.push(root);
                root = root.leftNode;
            }

            if (!stack.isEmpty()){
                root = stack.pop();
                list.add(root);
                root = root.rightNode;
            }
        }while (!stack.isEmpty() || root != null);

        return list.get(list.size() - k).val;
    }


    /**
     * 中序遍历二叉树的递归法
     * @param root
     */
    public void inOrderRes(TreeNode root){
        if (root == null)
            return;
        inOrderRes(root.leftNode);
        System.out.println(root.val);
        inOrderRes(root.rightNode);
    }

    /**
     * 中序遍历二叉树迭代法
     * @param root
     */
    public void inOrderRes2(TreeNode root){
        if (root == null)
            return;
        LinkedList<TreeNode> stack = new LinkedList<>();
        do {
            while (root != null){
                stack.push(root);
                root = root.leftNode;
            }

            if (!stack.isEmpty()){
                root = stack.pop();
                System.out.println(root.val);
                root = root.rightNode;
            }
        }while (!stack.isEmpty() || root != null);
    }



    @Test
    public void test(){
        TreeNode root = new TreeNode(3);
        root.leftNode = new TreeNode(1);
        root.rightNode = new TreeNode(4);
        root.leftNode.rightNode = new TreeNode(2);
//        inOrderRes(root);
//        inOrderRes2(root);
        int res = kthLargestWay(root, 1);
        System.out.println(res);
    }
}
