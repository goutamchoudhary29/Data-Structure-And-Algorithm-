package arrayList;
import java.util.*;
public class ascendingal {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(9);
        list.add(0);
        list.add(3);
        list.add(6);

        System.out.println(list);
        Collections.sort(list);//ascending order
         System.out.println(list);

        //descending
        Collections.sort(list ,Collections.reverseOrder());
        System.err.println(list);
    }
}
