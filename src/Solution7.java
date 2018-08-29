public class Solution7 {
    /**
     * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
     * n<=39
     * @param n
     * @return
     */
    public int Fibonacci(int n) {
        int n1=0;
        int n2 =1;
        int temp = 0;
        while (n>0){
            temp=n2;
            n2+=n1;
            n1=temp;
            n--;
        }
        return n1;
    }
}
