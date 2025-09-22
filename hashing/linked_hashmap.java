

//isme jese put karte hai vese hi print bhi karta hai order me or baki jo 
//opretion hoti hai hashmap me vese hi sab hote isme bhi
package hashing;

import java.util.LinkedHashMap;

public class linked_hashmap {
    public static void main(String[] args) {
        LinkedHashMap<String ,Integer>lhm =new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);

        System.out.println(lhm);
    }
}
 