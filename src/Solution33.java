import org.omg.CORBA.INTERNAL;

import java.util.Stack;

public class Solution33 {
    public static void main(String[] args) {
        Solution33 solution33 = new Solution33();
        System.out.println(solution33.GetUglyNumber_Solution(0));
    }
    /**
     * 题目描述
     * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
     * @param index
     * @return
     */
    public int GetUglyNumber_Solution(int index) {
        if(index==0) return 0;
        int[] unArr = new int[index];
        unArr[0]=1;
        int i2=0,i3=0,i5=0;
        int next =1;
        while (next<index){
            int n2 = unArr[i2]*2;
            int n3 = unArr[i3]*3;
            int n5 = unArr[i5]*5;
            int min = Math.min(n2,Math.min(n3,n5));
            unArr[next]=min;
            if(min==n2) i2++;
            if(min==n3) i3++;
            if(min==n5) i5++;
            next++;
        }
        return unArr[index-1];
    }
}
