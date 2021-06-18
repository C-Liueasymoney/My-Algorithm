package treeToDoublyList_36;

import org.junit.Test;


/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/29 9:18 下午
 */
public class MySolution {
    public Node treeToDoublyListWay(Node root){
        Node last = null;
        Node head = recur(root, last);

        while (head != null && head.left != null)
            head = head.left;
        return head;
    }

    public Node recur(Node root, Node last){
        if (root == null) return last;

        Node current = root;
        if (current.left != null)
            last = recur(current.left, last);

        current.left = last;
        if (last != null)
            last.right = current;

        last = current;

        if (current.right != null)
            last = recur(current.right, last);

        return last;
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
