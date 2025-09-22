import java.util.*;
public class binarysearch {
    public static int BinarySearch(int number[],int key){
int start=0,end=number.length-1;
while(start<=end){
    int mid=(start+end)/2;
    if(number[mid]==key){
        return mid;
    }
    if(number[mid]<key){
        start=mid+1;
    }
    if(number[mid]>key){
        end=mid-1;

    }
}
return -1;
    }
    public static void main(String[] args) {
        int number[]={2,3,5,7,9,12,14,18};
        int key=18;
        System.out.print("key idex is"+BinarySearch(number, key));
    }
}
