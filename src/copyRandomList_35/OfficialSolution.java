package copyRandomList_35;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/28 9:54 下午
 */
public class OfficialSolution {
    public Node copyRandomListWay(Node head){
        if (head == null) return null;
        Node temp = head;

        // 第一步：把复制出来的新节点交叉的拼接在老节点之间
        while (temp != null){
            Node node = new Node(temp.val);
            node.next = temp.next;
            temp.next = node;
            temp = node.next;
        }

        temp = head;
        // 第二步：把老节点的random指针以同样的顺序复制到新节点的random指针上
        while (temp != null){
            if (temp.random != null)
                temp.next.random = temp.random.next;
            temp = temp.next.next;
        }

        temp = head.next;
        Node pre = head, res = head.next;
        // 第三步：把新老节点拆分成两个链表
        while (temp.next != null){
            pre.next = pre.next.next;
            temp.next = temp.next.next;
            pre = pre.next;
            temp = temp.next;
        }

        pre.next = null;
        return res;
    }
}
