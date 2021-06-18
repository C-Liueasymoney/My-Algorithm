package getIntersectionNode_52;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/5/29 8:43 上午
 */
public class OfficialSolution {
    public ListNode getIntersectionNodeWay(ListNode headA, ListNode headB){
        ListNode result = null;
        if (headA == null || headB == null)
            return result;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int length1 = 0;
        int length2 = 0;
        while (temp1 != null){
            length1++;
            temp1 = temp1.next;
        }

        while (temp2 != null){
            length2++;
            temp2 = temp2.next;
        }

        if (length1 > length2){
            for (int i = 0; i < length1 - length2; i++){
                headA = headA.next;
            }
        }else {
            for (int i = 0; i < length2 - length1; i++){
                headB = headB.next;
            }
        }
        while (headA != null){
            if (headA == headB){
                result = headA;
                return result;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return result;
    }
}



class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}