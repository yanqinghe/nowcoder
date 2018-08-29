import java.util.HashMap;
import java.util.Map;

public class Solution25 {
    public RandomListNode Clone(RandomListNode phead)
    {
        Map<RandomListNode,RandomListNode> map = new HashMap<>();
        RandomListNode node = new RandomListNode(0);
        RandomListNode head = node;
        RandomListNode p = phead;
        while(phead!=null){
            node.next = new RandomListNode(phead.label);
            node = node.next;
            map.put(phead,node);
            phead = phead.next;
        }
        node = head.next;
        while(p!=null){
            node.random = map.get(p.random);
            node = node.next;
            p = p.next;
        }
        return head.next;
    }
 class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
}

