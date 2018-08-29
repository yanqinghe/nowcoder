import java.util.*;

public class Solution34 {
    public static void main(String[] args) {
        Solution34 solution34 = new Solution34();
        System.out.println(solution34.FirstNotRepeatingChar("aabccd"));
    }
    /**
     * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
     * @param str
     * @return
     */
    public int FirstNotRepeatingChar(String str) {
        //不符合要求的字符串直接返回-1
        if(str==null||str.length()==0) return -1;
        //初始化LinkedHashMap，用以保存每个字符对应的出现的位置，使用linkedHashMap的原因是
        //字符出现的顺序即是map内的顺序，
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        char[] chars = str.toCharArray();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            if(!set.contains(chars[i])){
                //如果没有出现过两次
                if(map.containsKey(chars[i])){
                    //如果再一次出现，从map中删除，放到Set中
                    map.remove(chars[i]);
                    set.add(chars[i]);
                }else {
                    //如果出现一次，记录位置
                    map.put(chars[i],i);
                }
            }
        }

        return map.values().iterator().next();
    }
}
