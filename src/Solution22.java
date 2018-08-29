import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Solution22 {
    /**
     * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
     * @param root
     * @return
     */
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root==null) return list;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (queue.size()>0){
            TreeNode node = queue.poll();
            list.add(node.val);
            if(node.left!=null)
            queue.add(node.left);
            if(node.right!=null)
            queue.add(node.right);
        }
        return list;
    }
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
}
