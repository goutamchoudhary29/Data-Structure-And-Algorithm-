package arrayList;

import java.util.ArrayList;

public class opertion_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer>list =new ArrayList<>();


        //add opertion are perform in array list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
    // in java save the value at index
    list.add(2,15);

        System.out.println(list);



    //get opertion
    int element=list.get(2);
    System.out.println(element);

    //delete /remove
    list.remove(2);
    System.out.println(list);

    //set element at index
    list.set(2,10);
    System.out.println(list);

    //contains
    System.out.println(list.contains(1));
    System.out.println(list.contains(11));
}
}
