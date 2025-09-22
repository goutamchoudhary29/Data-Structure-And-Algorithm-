import java.util.Scanner;

public class binomial {
    public static int factorial(int x){
        int f=1;
        for(int i =1;i<=x;i++){
            f*=i;

        }
        return f;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int r=sc.nextInt();

       int a = factorial(n);
       int b  = factorial(r);
       int c =factorial(n-r);

       int bino = a/(b*c);
        System.out.println("binomial cofficent is ..." + bino);


    }
}
