import java.util.*;
public class ArraysCC {
    public static int linearSerach(int number[],int key){
        for(int i=0;i<number.length;i++){
             if(number[i]==key){
                return i;
             }
             
        }
        return -1;
    }
public static void main(String[] args) {
    int number[]={9,8,5,6,7,9,7};
    int key=5;
    int index =linearSerach(number, key);

    if(index==-1){
        System.out.print("not found");
    }
    else{
        System.err.print("key index is"+index);
    }
}
}