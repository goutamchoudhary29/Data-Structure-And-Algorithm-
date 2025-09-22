public class Binarytodec{

public static void binToDec(int binNum){
    
    int mynum=binNum;
    int pow =0;
    int decNum=0;

    while(binNum>0){
        int lastDigit =binNum%10;
        decNum=decNum+(lastDigit*(int)Math.pow(2,pow));

        pow++;
        binNum=binNum/10; 
    }
    System.out.println("decimal of "+mynum +" ="+decNum);
}
public static void DecTOBin(int n){
    int pow=0;
    int binnum=0;
    while(n>0){
        int rem =n%2;
        binnum=binnum+ (rem  *  (int)Math.pow(10, pow));
        pow++;
        n=n/2;
    }
    System.out.println(binnum);
}
    public static void main(String[] args) {
        binToDec(101);
        DecTOBin(6);
    }
}