
//In this code use java collection framework to use direct use of stack funtiom import by

package stack;

import java.util.Stack;

public class simple {
    public static void main(String[] args) {
        Stack<Integer> s =new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);


        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
