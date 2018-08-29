import java.util.*;

public class Solution29 {
    public static void main(String[] args) {
        Solution29 solution29 = new Solution29();
        solution29.GetLeastNumbers_Solution(new int[]{1,2,3,4,5},2);
    }
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
            for (int i : input) {
            q.add(-i);
            if(q.size()>k){
                q.poll();
            }
        }
        ArrayList<Integer> res = new ArrayList<>(q.size());
        if(input==null||input.length==0||k>input.length) return res;

            Iterator<Integer> iter = q.iterator();
        while (iter.hasNext()){
            res.add(-iter.next());
        }
        Collections.reverse(res);
        return res;
    }
}
