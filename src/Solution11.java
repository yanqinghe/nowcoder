public class Solution11 {
    public static void main(String[] args) {
        Solution11 solution11 = new Solution11();
        solution11.NumberOf1(-2147483648        );
    }

    /**
     * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
     * @param n
     * @return
     */
    public int NumberOf1(int n) {
        int cnt =0;
        while (n!=0){
            if((n&1)==1) cnt++;
            n=n>>>1;
        }
        return cnt;
    }
}
