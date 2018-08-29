import java.util.ArrayList;
import java.util.LinkedList;

public class Solution3 {
    /**
     * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        LinkedList<Integer> res= new LinkedList<>();
        while (listNode !=null){
            res.addFirst(listNode.val);
            listNode= listNode.next;
        }
        return new ArrayList<>(res);
    }
    class ListNode {
        int val;
        ListNode next = null;

                ListNode(int val) {
            this.val = val;
        }
    }
}
