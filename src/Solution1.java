import java.util.Arrays;

public class Solution1 {

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.Find(8,new int[][]{
                {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15,16}
        }));
    }
    public boolean Find0(int target, int [][] array) {
        //直接使用foreach遍历
        for (int[] ints : array) {
            for (int i : ints) {
                if(i==target) return true;
            }
        }
        //这种情况就代表没不存在目标值
        return false;
    }

    public boolean Find(int target, int [][] array) {
        //获取行列数
        int m = array.length;
        int n = array[0].length;
        //定位起点为矩阵的左下角
        int i= m-1;
        int j = 0;
        //根据规则在矩阵中进行比较
        while (i>-1&&j<n){
            if(array[i][j]<target){
                //当目标值大于当前值时，向右移动
                j++;
            }else if(array[i][j]>target){
                //当目标值小于当前值时，向左移动
                i--;
            }else return true;//如果等于当前值，直接返回
        }
        //这种情况就代表没不存在目标值
        return false;
    }

}
