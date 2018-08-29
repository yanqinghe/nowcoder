import java.util.ArrayList;
import java.util.List;

public class Solution31 {
    public static void main(String[] args) {
        Solution31 solution31 = new Solution31();
        System.out.println(solution31.NumberOf1Between1AndN_Solution(99));;

    }

    /**
     * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
     * @param n
     * @return
     */
    public int NumberOf1Between1AndN_Solution(int n) {
        if(n<=0) return 0;
        if(n<=9) return 1;
        int r =9,l=1;//初始化上，下界
        while (r<n) {
            l=r+1;
            r = r * 10 + 9;
        }
        int cnt =0;
        int preCnt = NumberOf1Between1AndN_Solution(l-1);//前一个区间的个数统计
        //得到上界
        if(n<l*2){
            //当 l<=n<2l 时，1的数目为
            cnt=preCnt+n-l+1+NumberOf1Between1AndN_Solution(n-l);
        }else {
            //当 2l<=n<=r时,1数目为
            int num = n/l;
            cnt=preCnt+l+(num-1)*preCnt+NumberOf1Between1AndN_Solution(n-num*l);
        }
        return cnt;
    }







}
