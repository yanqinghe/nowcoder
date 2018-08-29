import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution13 {
    public static void main(String[] args) {
        Solution13 solution13= new Solution13();
        solution13.reOrderArray(new int[]{1,2,3,4,5,6,7});
    }
    /**
     * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
     * @param array
     */
    public void reOrderArray(int [] array) {
        int [] arr2 = Arrays.copyOf(array,array.length);
        int index =0;
        for (int i : arr2) {
            if((i&1)==1) array[index++]=i;
        }
        for (int i : arr2) {
            if((i&1)==0) array[index++]=i;
        }
    }
}
