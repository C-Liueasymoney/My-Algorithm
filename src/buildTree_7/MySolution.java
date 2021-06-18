package buildTree_7;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/6/16 2:21 下午
 */
public class MySolution {
    Map<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        return recurBuildTree(preorder, 0, 0, preorder.length - 1);
    }

    public TreeNode recurBuildTree(int[] preorder, int root, int left, int right){
        if (left > right)
            return null;
        TreeNode node = new TreeNode(preorder[root]);
        int middle = map.get(preorder[root]);
        node.left = recurBuildTree(preorder, root + 1, left, middle - 1);
        node.right = recurBuildTree(preorder, root + middle - left + 1, middle + 1, right);
        return node;
    }
}
