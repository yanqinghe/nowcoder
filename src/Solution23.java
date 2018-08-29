public class Solution23 {
    public static void main(String[] args) {
        Solution23 solution23 = new Solution23();
        solution23.VerifySquenceOfBST(new int[]{6,4,3,7,10,9,5});
    }
    /**
     * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
     * @param sequence
     * @return
     */
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence==null||sequence.length<1) return false;
        return isOK(sequence,0,sequence.length-1);
    }
    private boolean isOK(int[] s,int i,int j){
        if(i>=j) return true;
        int k = i;
        for (; k <j ; k++) {
            if(s[k]>s[j])break;
        }
        for (int l = k; l < j; l++) {
            if(s[l]<s[j]) return false;
        }
        return isOK(s,i,k-1)&&isOK(s,k,j-1);
    }
}
