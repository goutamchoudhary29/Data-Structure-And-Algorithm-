import java.util.Scanner;

import javax.security.sasl.SaslException;

public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int fact = 1;
        System.out.println("enter any postive integer:");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial:" + fact);
    }
}