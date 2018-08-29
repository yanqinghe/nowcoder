import java.util.Arrays;
import java.util.Comparator;

public class Solution32 {

    public static void main(String[] args) {
        Solution32 solution32 = new Solution32();
        System.out.println(solution32.PrintMinNumber(new int[]{
                3,32,321
        }));
    }
    class Number {
        int num = 0;
        StringBuilder sb;
        String str;
        public Number(int num) {
            this.num = num;
            sb = new StringBuilder(num+"");
        }
        public void resize(int len){
            char c= sb.charAt(sb.length()-1);
            for (int i = sb.length(); i < len; i++) {
                sb.append(c);
            }
            str=sb.toString();
        }


    }

    /**
     * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
     * @param numbers
     * @return
     */
    public String PrintMinNumber(int [] numbers) {
        int size = numbers.length;
        Number[] numbers1 = new Number[size];
        int len = 0;
        for (int i = 0; i <size ; i++) {
            numbers1[i]= new Number(numbers[i]);
            len = Math.max(numbers1[i].sb.length(),len);
        }
        for (int i = 0; i < size; i++) {
            numbers1[i].resize(len);
        }
        Arrays.sort(numbers1, Comparator.comparing(o -> o.str));
        StringBuilder sb = new StringBuilder();
        for (Number number : numbers1) {
            sb.append(number.num+"");
        }
        return sb.toString();
    }
}
