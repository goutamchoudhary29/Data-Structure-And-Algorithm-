package hashing;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        //Create
        HashMap<String ,Integer>hm =new HashMap<>();

        //Insert -o(1) --value or key ko add karte hai---
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("nepal", 50);

        System.out.println(hm);


        //get operation -o(1)---isme  get karte hai value ko pata karte hai --
        int population =hm.get("China");
        System.out.println(population);
        System.out.println(hm.get("India"));

        //containsKey -o(1)---isme value hai ya nhi ko patha karte hai or ye true or false return karti hai
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("USA"));

        //remove o(1)--isme remove ka dete hai or vali bhi print ho jati hai

        System.out.println(hm.remove("China"));
        System.out.println(hm);

        //size  ----size patha karene ke liye opration
        System.out.println(hm.size());

        //is empty -- mean kya koi value hai hi nhi
        System.out.println(hm.isEmpty());

    }

}
