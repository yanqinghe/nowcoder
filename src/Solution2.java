public class Solution2 {
    /**
     * 题目描述
     * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
     * @param str
     * @return
     */
    static final String s = "%20";
    public String replaceSpace(StringBuffer str) {
        StringBuilder sb = new StringBuilder();
        int len =str.length();
        for (int i = 0; i < len; i++) {
            if(str.charAt(i)!=' ') sb.append(str.charAt(i));
            else sb.append(s);
        }
        return sb.toString();
    }
}
