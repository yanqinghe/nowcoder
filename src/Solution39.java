public class Solution39 {
    /**
     * 题目描述
     * 一个整型数组里除了两个数字之外，其他的数字都出现了偶数次。请写程序找出这两个只出现一次的数字。
     * @param array
     * @param num1
     * @param num2
     */
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int x=0;
        for (int i : array) {
            x^=i;
        }
        for (int i : array) {
            if((i&x)>0) num1[0]^=i;
            else num2[0]^=i;
        }
    }
}
