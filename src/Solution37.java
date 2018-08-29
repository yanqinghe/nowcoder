import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution37 {
    public static void main(String[] args) {
        Solution37 solution37 = new Solution37();
        System.out.println(solution37.GetNumberOfK(new int[]{
3
        },3));
    }

    /**
     * 题目描述
     * 统计一个数字在排序数组中出现的次数。
     * @param array
     * @param k
     * @return
     */
    public int GetNumberOfK(int [] array , int k) {
        if(array==null||array.length==0) return 0;
        //使用二分法获取获取位置
        int mid = Arrays.binarySearch(array,k);
        //如果没有找到的话，直接返回负值
        if(mid<0) return 0;
        int i = 1;
        int l = mid-1;
        //统计左半部分
        for (; l >=0; l--,i++) {
            if(array[l]!=k) break;
        }
        //统计右半部分
        int r = mid+1;
        for (; r < array.length; r++,i++) {
            if(array[r]!=k) break;
        }
        return i;
    }
}
