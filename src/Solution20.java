import org.omg.CORBA.INTERNAL;

import java.util.*;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））
 */
public class Solution20 {

    Stack<Integer> stack = new Stack<>();
    int min = Integer.MAX_VALUE;
    public void push(int node) {
        stack.push(node);
        min = Math.min(node,min);
    }

    public void pop() {
        if(stack.pop()==min){
            min= Integer.MAX_VALUE;
            Iterator<Integer> it = stack.iterator();
            while (it.hasNext()){
                min=Math.min(min,it.next());
            }
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return min;
    }
}
