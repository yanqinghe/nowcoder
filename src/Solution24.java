import java.util.ArrayList;
import java.util.List;

public class Solution24 {
    /**
     * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
     * @param root
     * @param target
     * @return
     */
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> lists =new ArrayList<>();
        dfs(root,target,0,lists,new ArrayList<>());
        return lists;
    }
    private void dfs(TreeNode root, int target, int sum, ArrayList<ArrayList<Integer>> lists, ArrayList<Integer> list){
        if(root==null){
            if(sum==target){
                lists.add(new ArrayList<>(list));
            }
            return;
        }
        sum+=root.val;
            list.add(root.val);
            dfs(root.left,target,sum,lists,list);
            dfs(root.right,target,sum,lists,list);
            list.remove(list.size()-1);
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
