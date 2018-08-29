import org.omg.CORBA.INTERNAL;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Solution40 {
    public static void main(String[] args) {
        Solution40 solution40 = new Solution40();
        System.out.println(solution40.FindContinuousSequence(1));
    }

    /**
     * 题目描述
     * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
     * 输出描述:
     * 输出所有和为S的连续正数序列。序列内按照从小至大的
     * @param sum
     * @return
     */
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res= new ArrayList<>();
        double num = 0.0;
        int numInt =0;
        int start =0;
        for (int i = 1; ; ) {
            //复数的情况
            i++;
            num=sum/(double)i;
            numInt = (int)num;
            start =numInt-i/2+1;
            if(start<=0) break;
            if((num-(int)num-0.5)==0){
                res.add(0,getList(start,start+i));
            }
            i++;
            //单数的情况
            num=sum/(double)i;
            numInt = (int)num;
            start =numInt-i/2;
            if(start<=0) break;
            if(num-numInt==0){
                res.add(0,getList(start,start+i));
            }

        }
        return res;
    }
    ArrayList<Integer> getList(int start,int end){
        ArrayList<Integer> arrayList = new ArrayList<>(end-start);
        for (int i = start; i < end ; i++) {
            arrayList.add(i);
        }
        return arrayList;
    }
}
