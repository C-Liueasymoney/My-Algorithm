package levelOrder_32_3;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/23 6:41 下午
 */
public class MySolution {
    public List<List<Integer>> levelOrderWay(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return res;
        queue.add(root);
        int flag = 1;

        while (!queue.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--){
                if ((flag & 1) == 1){
                    TreeNode node = queue.poll();
                    temp.add(node.val);
                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);
                }
                if ((flag & 1) == 0){
                    TreeNode node = queue.poll();
                    temp.add(0, node.val);
                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);
                }
            }
            res.add(temp);
            flag++;
        }
        return res;
    }
}
