package pathSum_34;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/27 10:36 下午
 */
public class OfficialSolution {
    List<List<Integer>> result = new LinkedList<>();
    LinkedList<Integer> queue = new LinkedList<>();

    public List<List<Integer>> pathSumWay(TreeNode root, int target){
        recur(root, target);
        return result;
    }

    public void recur(TreeNode root, int target){
        if (root == null) return;

        queue.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null){
            result.add(new LinkedList<>(queue));
        }
        recur(root.left, target);
        recur(root.right, target);
        queue.removeLast();
    }

    @Test
    public void test(){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);

        List<List<Integer>> lists = pathSumWay(root, 22);
        System.out.println(lists);
    }
}
