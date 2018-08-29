public class Solution36 {
    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * 题目描述
     * 输入两个链表，找出它们的第一个公共结点。
     * @param pHead1
     * @param pHead2
     * @return
     */
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        //获取头指针
        ListNode node1 = pHead1;
        ListNode node2 = pHead2;
        //得到两个链表的长度
        int len1 = getLen(node1);
        int len2 = getLen(node2);
        //计算长度差
        int d = len1-len2;
        //node1为长链表的头指针，node2为短链表的头指针
        if(d>0){
            node1 = pHead1;
            node2 = pHead2;
        }else {
            node1 = pHead2;
            node2 = pHead1;
        }
        //首先移动长链表的指针
        while (d>0){
            d--;
            node1 = node1.next;
        }
        //然后共同移动两个链表的指针,直到遇到相同的节点
        while (node1!=node2){
            node1=node1.next;
            node2=node2.next;
        }
        return node1;
    }

    /**
     * 获取链表的长度
     * @param head 链表的头指针
     * @return
     */
    private int getLen(ListNode head){
        int len =0;
        while (head!=null){
            head=head.next;
            len++;
        }
        return len;
    }
}
