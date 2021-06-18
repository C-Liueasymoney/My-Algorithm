package mergeTwoLists_25;


/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/21 8:10 下午
 */
public class MySolution {
    //递归
    public ListNode mergeTwoListWay(ListNode l1, ListNode l2){
        //判断两节点为空的情况，一节点为空，返回另一节点（可能为空也可能不为空）
        if (l1 == null)
            return l2;
        else if (l2 == null)
            return l1;
        //创建保存结果的头节点
        ListNode res;

        //l1的值比l2小，就把l1添加在res中
        if (l1.val < l2.val){
            res = l1;
            //这里只移动l1的指针，因为只把l1的一个节点放出去了，返回的结果即为后续递归的res链表直接存入res.next
            res.next = mergeTwoListWay(l1.next, l2);
        }else {
            //与上同理
            res = l2;
            res.next = mergeTwoListWay(l1, l2.next);
        }
        return res;
    }
}
