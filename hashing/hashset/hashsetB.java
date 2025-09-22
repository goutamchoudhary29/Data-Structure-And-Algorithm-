
//in this code hashset is unique element are print and count not duplicate in any case duplicate is come this case ignore duplicate 

package hashing.hashset;

import java.util.HashSet;

public class hashsetB {
    public static void main(String[] args) {
        HashSet<Integer>set =new HashSet<>();


        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);

        System.out.println(set);
     
       
        System.out.println(set.isEmpty());
        System.out.println(set.size());
    }
}
