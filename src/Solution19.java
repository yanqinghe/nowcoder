import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution19 {
    public static void main(String[] args) {
        Solution19 solution19 = new Solution19();
        solution19.printMatrix(new int[][]{
                {1,2,3,4,5},
                {2},
                {3},
                {4}
        });
    }
    private static int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};

    /**
     * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
     * @param matrix
     * @return
     */
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int m =matrix.length;
        int n = matrix[0].length;
        ArrayList<Integer> list = new ArrayList<>(m*n);
        int[][] bound=new int[][]{{-1,n},{m,n},{m,-1},{0,-1}};
        int i =0,j=0;
        int d = 0;
        while (i!=bound[d][0]&&j!=bound[d][1]){
            list.add(matrix[i][j]);
            i+=dir[d][0];
            j+=dir[d][1];
            if(i==bound[d][0]||j==bound[d][1]){
                bound[d][0]-=dir[d][0];
                bound[d][1]-=dir[d][1];
                i-=dir[d][0];
                j-=dir[d][1];
                d=(d+1)%4;
                i+=dir[d][0];
                j+=dir[d][1];
            }

        }
        return list;
    }
}
