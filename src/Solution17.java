public class Solution17 {
    public static void main(String[] args) {
        Solution17 solution17 = new Solution17();
        solution17.test();
    }
    private void test(){
        TreeNode treeNode  =new TreeNode(8);
        treeNode.left = new TreeNode(8);
        treeNode.right = new TreeNode(7);
        treeNode.left.left = new TreeNode(9);
        treeNode.left.right = new TreeNode(2);
        treeNode.left.left.left = new TreeNode(4);
        treeNode.left.left.right = new TreeNode(7);

        TreeNode treeNode2  =new TreeNode(8);
        treeNode2.left = new TreeNode(9);
        treeNode2.right = new TreeNode(2);
        HasSubtree(treeNode,treeNode2);
    }

    /**
     * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
     * @param root1
     * @param root2
     * @return
     */
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root2==null) return false;
       treeNode = root2;
        return isSubTree(root1,root2);
    }
    private TreeNode treeNode = null;
    private boolean isSubTree(TreeNode root1,TreeNode root2){
        if(root2==null) return true;
        if(root1==null) return false;
        if(root1.val==root2.val){
            return isSubTree(root1.left,root2.left)&&isSubTree(root1.right,root2.right)||isSubTree(root1.left,treeNode)||isSubTree(root1.right,treeNode);
        }
        if(root1.val==treeNode.val){
            return isSubTree(root1,treeNode);

        }
            return isSubTree(root1.left,treeNode)||isSubTree(root1.right,treeNode);
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
