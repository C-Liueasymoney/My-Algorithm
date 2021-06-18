package copyRandomList_35;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/27 10:47 下午
 */
public class MySolution {
    public Node copyRandomListWay(Node head){
        if (head == null) return null;
        Map<Node, Node> map = new HashMap<>();
        Node temp = head;

        while (temp != null){
            map.put(temp, new Node(temp.val));
            temp = temp.next;
        }

        temp = head;
        while (temp != null){
            map.get(temp).next = map.get(temp.next);
            map.get(temp).random = map.get(temp.random);
            temp = temp.next;
        }

        return map.get(head);
    }
}
