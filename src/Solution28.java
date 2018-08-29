public class Solution28 {
    public static void main(String[] args) {
        Solution28 solution28 = new Solution28();
        solution28.MoreThanHalfNum_Solution(new int[]{
                2,2,2,2,2,1,3,4,5
        });
    }
    public int MoreThanHalfNum_Solution(int [] array) {
        int cnt =0;
        int num = array[0];
        for (int i : array) {
            if(i==num){
                cnt++;
            }else {
                cnt--;
                if(cnt==-1) {
                    cnt=0;
                    num=i;
                }
            }
        }
        return cnt>0?num:0;
    }
}
