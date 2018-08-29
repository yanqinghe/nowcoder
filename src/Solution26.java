import java.util.*;

public class Solution26 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null) return pRootOfTree;
        LinkedList<TreeNode> list = new LinkedList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode node = pRootOfTree;
        while (node!=null || !s.isEmpty()){
            while (node!=null){
                s.push(node);
                node=node.left;
            }
            TreeNode cur = s.pop();
            list.add(cur);
            node = cur.right;
        }
        Iterator<TreeNode> it = list.iterator();
        TreeNode pre= it.next();
        pre.left=null;
        while (it.hasNext()){
            TreeNode cur = it.next();
            pre.right=cur;
            cur.left=pre;

            pre=cur;
        }
        list.getLast().right=null;
        return list.getFirst();

    }
     public class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
     this.val = val;

     }

     }
}
