import java.util.*;

public class Solution27 {
    public ArrayList<String> Permutation(String str) {
        Set<String> res = new HashSet<>();
        if(str==null||str.length()<1) return new ArrayList<>();
        dfs(str.toCharArray(),new boolean[str.length()],new StringBuilder(),res,str.length());
        ArrayList<String> list = new ArrayList<>(res);
        Collections.sort(list);
        return list;
    }
    private void dfs(char[]chars, boolean[] b,StringBuilder sb,Set<String> res,int len){
        if(sb.length()==len){
            //当得到完整的新字符串后，添加到结果集中
            res.add(sb.toString());
        }else {
            for (int i = 0; i < len; i++) {
                if(!b[i]){
                    b[i]=true;
                    dfs(chars,b,sb.append(chars[i]),res,len);
                    b[i]=false;
                    sb.deleteCharAt(sb.length()-1);
                }
            }
        }
    }
}
