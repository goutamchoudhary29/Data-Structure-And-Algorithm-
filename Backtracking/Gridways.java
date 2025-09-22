

//give an 2D mattrix to find to how may posible way to go in last cells
//only perform right and down opretion int this code
package Backtracking;

public class Gridways {
    public static int gridways(int i, int j, int n ,int m){
        //base case
        if(i==n-1&&j==m-1){//codn for last cell
            return 1;
        }else if (i==n || j==n){
            return 0;
        }

        int w1 =gridways(i+1, j, n, m);
        int w2=gridways(i, j+1, n, m);
        return w1+w2;
    }
    public static void main(String[] args) {
        int n=4,m=4;
        System.out.println(gridways(0, 0, n, m));
    }
    
}
