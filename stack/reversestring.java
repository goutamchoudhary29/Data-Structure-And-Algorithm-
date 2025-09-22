
//In this code  reverse the string like abc =bca with help of stack
package stack;
import java.util.*;
public class reversestring {
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx =0;
        while (idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result =new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str ="goutam";
        String result =reverseString(str);
        System.out.println(result);
    }
}
