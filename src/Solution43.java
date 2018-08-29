import java.lang.reflect.Array;
import java.util.Collections;

public class Solution43 {
    public static void main(String[] args) {
        Solution43 solution43= new Solution43();
        System.out.println(        solution43.ReverseSentence("I am a student."));
    }
    /**
     * 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
     * @param str
     * @return
     */
    public String ReverseSentence(String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder res= new StringBuilder();
        for (char c : str.toCharArray()) {
            sb.append(c);
            if(c==' '){
                res.insert(0,sb);
                sb = new StringBuilder();
            }
        }
        res.insert(0,sb.append(' '));
        if(res.length()>str.length()){
            res.deleteCharAt(str.length());
        }
        return res.toString();
    }
}
