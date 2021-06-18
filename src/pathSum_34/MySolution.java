package pathSum_34;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/27 9:27 下午
 */
public class MySolution {
    List<List<Integer>> result = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();
    public List<List<Integer>> pathSumWay(TreeNode root, int target){

        if (root == null) return result;

        if (root.val < target){
            target -= root.val;
            list.add(root.val);
            pathSumWay(root.left, target);
            pathSumWay(root.right, target);
            list.remove(list.size() - 1);
        }else if (root.val == target && root.left == null && root.right == null){
            list.add(root.val);
            ArrayList<Integer> temp = new ArrayList<>(list);
            result.add(temp);
            list.remove(list.size() - 1);
        }else {
            return null;
        }
        return result;
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
