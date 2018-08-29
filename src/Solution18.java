public class Solution18 {
    /**
     * 操作给定的二叉树，将其变换为源二叉树的镜像。
     * @param root
     */
    public void Mirror(TreeNode root) {
        if(root==null) return;
        TreeNode t = root.left;
        root.left=root.right;
        root.right=t;
        Mirror(root.left);
        Mirror(root.right);
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
