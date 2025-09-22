package arrayList;

import java.util.ArrayList;

public class sizeofal {
    public static void main(String[] args) {
        ArrayList<Integer>list =new ArrayList<>();
    list.add(7);
    list.add(6);
    list.add(8);
    list.add(4);
    list.add(1);
  //  System.out.println(list.size());
    // //print the arraylist
    // for(int i=0;i<list.size();i++){
    //     System.out.print(list.get(i) +" ");
    // }
    // System.out.println();


    //print reverse of an arraylist
    // for(int i=list.size()-1;i>=0;i--){
    //     System.out.print(list.get(i)+" ");
    // }
    // System.out.println();

    //maximum number in arraylist to print

    int max=Integer.MIN_VALUE;
    for(int i=0;i<list.size();i++){
        // if(max<list.get(i)){
        //     max =list.get(i);
        // }
        max =Math.max(max, list.get(i));
    }
    System.out.println("max element = "+max);
















    }
}
