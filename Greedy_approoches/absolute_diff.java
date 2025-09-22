
// absolute difference pairs mean a-b= a,b-a=a are absolute diffrence pair
//que -Min Absolute Diffrence Pairs
//given two arrays A and B of  equal lenght n.Pair each elemtn of array 
//A to an element in array B ,such that sum S of absloute diffrences of all the pairs is minimum.

package Greedy_approoches;

import java.lang.reflect.Array;
import java.util.Arrays;

public class absolute_diff {
         public static void main(String[] args) {
            int A[]={4,1,8,7};
            int B[]={2,3,6,5};

            Arrays.sort(A);
            Arrays.sort(B);

            int minDiff =0;

            for(int i=0;i<A.length;i++){
                minDiff+= Math.abs(A[i]-B[i]);

            }
            System.out.println("min absolute diff of pairs ="+minDiff);
         }
}
