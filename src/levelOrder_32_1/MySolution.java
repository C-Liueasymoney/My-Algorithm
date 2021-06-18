package levelOrder_32_1;

import org.junit.Test;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/23 11:31 上午
 */
public class MySolution {
    public int[] levelOrderWay(TreeNode root){
        int[] res;
        if (root == null) return new int[0];
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            list.add(node.val);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        res = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            res[i] = list.get(i);
        return res;
    }

    @Test
    public void test(){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int[] result = levelOrderWay(root);
        System.out.println(Arrays.toString(result));

        System.out.println(levelOrderWay(null));
    }
}
