public class Solution14 {
    /**
     * 输入一个链表，输出该链表中倒数第k个结点。
     * @param head
     * @param k
     * @return
     */
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode h = head;
        int len =0;
        while (head!=null){
            head = head.next;
            len++;
        }
        len=len-k;
        if(len<0) return null;
        while (len>0){
            h=h.next;
            len--;
        }
        return h;
    }
 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
}
