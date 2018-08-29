import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution35 {
    public static void main(String[] args) {
        Solution35 solution35 = new Solution35();
        System.out.println(solution35.InversePairs(new int[]{
                1,2,3,4,5,6,7,0
        }));
    }
    public int InversePairs(int [] array) {
        return (int) cal(array,0,array.length-1,new LinkedList<>());
    }
    private final static int MOD = 1000000007;
    private long cal(int[] array, int i, int j, LinkedList<Integer> sorted){
        if(i==j) return 0;
        //当前两个数组的统计值
        long cnt =0;
        //中间位置
        int mid = i+(j-i)/2;
        //递归计算两个子数组
        cnt=(cnt+cal(array,i,mid,sorted))%MOD;
        cnt=(cnt+cal(array,mid+1,j,sorted))%MOD;
        //计算两个子数组的逆序对数目
        int l = mid;//初始化指针l指向第一个数组的尾部
        int r = j;//初始化指针r只想第二个数组的尾部
        int index = j;
        while (l>=i&&r>mid){
            //array[l]代表第一个数组的数字
            //array[r]代表第二个数组的数字
            if(array[l]>array[r]){
                //array[i]>array[r]，说明array[i]与第二数组中[0,1,..,r]这些数字都构成了逆序对，直接计算即可。
                cnt=(cnt+(r-mid))%MOD;
                //同时移动第一个数组的指针
                sorted.addFirst(array[l]);
                l--;
            }else {
                //如果array[i]<=array[r]，说明array[r]肯定大于第一个数组中的剩余的数字。所以移动指针，跳过该数字
                sorted.addFirst(array[r]);
                r--;
            }
        }
        //将第一个数组中剩余的数字放入list中，如果有的话
        while (l>=i){
            sorted.addFirst(array[l]);
            l--;
        }
        //将第二个数组剩余的数字放入list中，如果有的话
        while (r>mid){
            sorted.addFirst(array[r]);
            r--;
        }
        //将已经排序好的序列覆盖原数组的对应位置[i,j]，避免后续的重复计算
        for (Integer num : sorted) {
            array[i++]=num;
        }
        //清空sorted数组
        sorted.clear();
        return cnt%MOD;
    }

    /**
     * 枚举法,只能通过50%，超时
     * @param array

     */
    private int InversePairs1(int [] array){
        int cnt =0;
        int len = array.length;
        for (int k = 0; k < len; k++) {
            for (int l = k+1; l <len ; l++) {
                if(array[k]<array[l]) cnt++;
            }
        }
        return cnt;
    }
}
