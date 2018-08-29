public class Solution38 {
    public boolean IsBalanced_Solution(TreeNode root) {
        return h(root)!=-1;
    }
    private int h(TreeNode node){
        if(node==null) return 0;
        int left = h(node.left);
        int right = h(node.right);
        if(left==-1||right==-1 || Math.abs(left-right)>1) return -1;
        return Math.max(h(node.left),h(node.right))+1;
    }
    class TreeNode{
        TreeNode left;
        TreeNode right;
    }
}
