import java.util.List;

public class Solution16 {
    /**
     * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
     * @param list1
     * @param list2
     * @return
     */
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode res = new ListNode(0);
        ListNode head = res;
        while (list1!=null&&list2!=null){
            if(list1.val>=list2.val){
                res.next=list2;
                list2=list2.next;
            }else {
                res.next=list1;
                list1=list1.next;
            }
            res=res.next;
        }
        if(list1==null) res.next = list2;
        else res.next=list1;
        return head.next;
    }
    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
