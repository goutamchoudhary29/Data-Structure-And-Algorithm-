


//If check valid or not valid mean in the give string or charcter are vaild mean give (),{},[] are
// write place to place any missing place give two option true or false

package stack;

import java.util.*;

public class vvalid {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {// opening
                s.push(ch);
            } else {
                // closing
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && ch == ')')// ()
                        || (s.peek() == '{' && ch == '}')// {}
                        || (s.peek() == '[' && ch == ']')) {// []
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String args[]) {
        String str = "({})[]";// true
        System.out.println(isValid(str));
    }

}