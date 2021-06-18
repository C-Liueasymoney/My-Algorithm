package bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description:广度优先遍历树，如果遍历图要加上一个Set来存放已经遍历过的节点
 * @Author: chong
 * @Data: 2021/4/17 9:35 下午
 */
public class BFSTest {

    public void BFSWithQueue(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null){
            queue.add(root);
        }
        while (!queue.isEmpty()){
            TreeNode treeNode = queue.poll();

            if (treeNode.leftNode != null)
                queue.add(treeNode.leftNode);
            if (treeNode.rightNode != null)
                queue.add(treeNode.rightNode);
        }
    }
}
