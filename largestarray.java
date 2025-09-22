import java.util.*;

public class largestarray {
    public static int LargestArray(int number[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
            if (smallest > number[i]) {
                smallest = number[i];
            }

        }
        System.out.println("smallest number is " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int number[] = { 2, 8, 6, 4, 9, 27, 2 };
        int big = LargestArray(number);
        System.out.print("largest number is" + big);
    }
}