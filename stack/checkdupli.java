
//check bractes or bigbractes are not double in the
// code for this situation like code ((a+b)) in this exam-le extied double bracetas
package stack;

import java.util.Stack;

public class checkdupli {
    public static boolean IsDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // closing
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;// duplicate
                } else {
                    s.pop();// openign pair
                }
            } else {
                // opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //Valid string
        String str ="((a+b))";//true
        String str2="(a-b)";//false
        System.out.println(IsDuplicate(str));
    }

}
