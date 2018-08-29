public class Solution8 {
    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
     * @param target
     * @return
     */
    public int JumpFloor(int target) {
        int n1 =1;
        int n2 =1;
        while (target>1){
            int temp = n2;
            n2 = n1+n2;
            n1=temp;
            target--;
        }
        return n2;
    }
}
