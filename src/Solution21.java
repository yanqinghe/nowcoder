import java.util.HashMap;
import java.util.Map;

public class Solution21 {
    /**
     * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
     * @param pushA
     * @param popA
     * @return
     */
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        int len = pushA.length;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <len ; i++) {
            map.put(pushA[i],i);
        }
        int max =0;
        boolean[] arr = new boolean[len];
        for (int i : popA) {
            if(!map.containsKey(i)) return false;
            int index = map.get(i);
            arr[index]=true;
            if(index>max) max=index;
            else {
                for (int j = index+1; j < max; j++) {
                    if(!arr[j]) return false;
                }
            }
        }
        return true;
    }
}
