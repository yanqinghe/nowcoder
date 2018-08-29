import javax.swing.tree.TreeNode;
import java.lang.reflect.Array;
import java.util.*;

public class Solution4 {
    public static void main(String[] args) {
        Solution4  solution4 = new Solution4();
        solution4.reConstructBinaryTree(new int[]{
                1,2,3,4,5,6,7
        },new int[]{
                3,2,4,1,6,5,7
        });
    }

    /**
     * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
     * @param pre
     * @param in
     * @return
     */
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        Map<Integer,Integer> inMap = new HashMap<>();
        int len = pre.length;
        for (int i = 0; i < len; i++) {
            inMap.put(in[i],i);
        }
        return help(pre,0,len-1,in,0,len-1,inMap);
    }

    private TreeNode help(int[] pre,int preStart,int preEnd,int[] in,int inStart, int inEnd,
                         Map<Integer,Integer> inMap){
                              if(preStart>preEnd) return null;
        TreeNode treeNode = new TreeNode(pre[preStart]);
        int index = inMap.get(pre[preStart]);
        treeNode.left = help(pre,preStart+1,preStart+index-inStart,in,inStart,index-1,inMap);
        treeNode.right = help(pre,preStart+index-inStart+1,preEnd,in,index+1,inEnd,inMap);
        return treeNode;
    }
      class TreeNode {
     int val;
     TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
