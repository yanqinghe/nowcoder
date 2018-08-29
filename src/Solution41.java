import java.util.ArrayList;

public class Solution41 {
    /**
     * 题目描述
     * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
     * 输出描述:
     * 对应每个测试案例，输出两个数，小的先输出。
     * @param array
     * @param sum
     * @return
     */
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        int l =0;
        int r = array.length-1;
        int num =0;
        ArrayList<Integer> arrayList= new ArrayList<>();
        while (l<r){
            num=array[l]+array[r];
            if(num==sum) {
                arrayList.add(array[l]);
                arrayList.add(array[r]);
                break;
            }else if(num>sum){
                r--;
            }else {
                l++;
            }
        }
        return arrayList;
    }
}
