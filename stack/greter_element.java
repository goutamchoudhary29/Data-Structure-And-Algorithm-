
//The next greater element of some element x in an array is the first greater
//element that is to the right of x in the same array.
//arr=[6,8,0,1,3]
//next greater =[8,-1,1,3,-1]

// In this question to form more questions
//next Greater right  (for this code)
//next Greater left  (change on loop condtion =for(int i =0;i<=n;i++))
//next Smaller Right ( change in this code in one line =  while (!s.isEmpty() && arr[s.peek()]>=arr[i]))
//next Smaller left (change in this code two line = for(int i =0;i<=n;i++)  , while (!s.isEmpty() && arr[s.peek()]>=arr[i]))
package stack;

import java.util.*;

public class greter_element {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            // 1 while
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            // 2 if-else
            if (s.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[s.peek()];
            }
            // 3 push in stack
            s.push(i);
        }
        for (int i = 0; i < nxtGreater.length; i++) {
            System.out.print(+nxtGreater[i] + " ");
        }
        System.out.println();
    }
}
