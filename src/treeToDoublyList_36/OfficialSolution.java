package treeToDoublyList_36;

import org.junit.Test;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/30 10:40 下午
 */
public class OfficialSolution {
    Node pre, head;
    public Node treeToDoublyListWay(Node root){
        if (root == null) return null;
        recur(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    public void recur(Node cur){
        if (cur == null) return;
        recur(cur.left);
        if (pre != null)
            pre.right = cur;
        else
            head = cur;
        cur.left = pre;
        pre = cur;
        recur(cur.right);
    }

    @Test
    public void test(){
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);

        Node node = treeToDoublyListWay(root);

        while (node != null) {
            System.out.print(node.val + " ");
            node = node.right;
        }
    }
}
