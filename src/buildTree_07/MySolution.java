package buildTree_07;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/10 10:41 下午
 */
public class MySolution {
    private Map<Integer, Integer> indexMap;

    //递归方法,leetcode官方答案
    public TreeNode buildTreeWay(int[] preorder, int[] inorder){
        int n = preorder.length;
        indexMap = new HashMap<>();
        for (int i = 0; i < preorder.length; i++){
            indexMap.put(preorder[i], i);
        }

        return recur(preorder, inorder, 0, n - 1, 0, n - 1);
    }

    public TreeNode recur(int[] preorder, int[] inorder, int preorderLeft, int preorderRight, int inorderLeft, int inorderRight){
        //递归结束条件
        if (preorderLeft > preorderRight){
            return null;
        }
        //前序遍历的第一位就是根节点
        int preorderRoot = preorderLeft;
        //在中序遍历中定位根节点
        int inorderRoot = indexMap.get(preorder[preorderRoot]);
        //生成根节点
        TreeNode root = new TreeNode(preorder[preorderRoot]);
        //得到左子节点的数目
        int sizeLeftSubtree = inorderRoot - inorderLeft;
        //递归构造左子树，并且连接到根节点
        root.left = recur(preorder, inorder, preorderLeft + 1, preorderLeft + sizeLeftSubtree, inorderLeft, inorderRoot - 1);
        //递归构造右子树，连接到根节点
        root.right = recur(preorder, inorder, preorderLeft + sizeLeftSubtree + 1, preorderRight, inorderRoot + 1, inorderRight);

        return root;
    }

    @Test
    public void test(){
        int[] pre = new int[] {3,9,20,15,7};
        int[] ino = new int[] {9,3,15,20,7};
        TreeNode treeNode = buildTreeWay(pre, ino);
        while (treeNode != null){
            System.out.println(treeNode.val);
            treeNode = treeNode.right;
        }
    }


    public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
    }
}
