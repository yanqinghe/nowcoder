public class Solution15 {
    /**
     * 输入一个链表，反转链表后，输出新链表的表头。
     * @param head
     * @return
     */
    public ListNode ReverseList(ListNode head) {
        if(head==null) return head;
        ListNode pre = head;
        head = head.next;
        pre.next=null;
        while (head!=null){
            ListNode temp = head.next;
            head.next = pre;
            pre=head;
            head=temp;
        }
        return pre;
    }
    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
