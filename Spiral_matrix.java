public class Spiral_matrix {
    public static void printspiral(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol =matrix[0].length-1;

       while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }//right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottm
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for(int i=endRow-1;i>=startRow+1;i-- ){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;


        }
        System.out.println();
    }
     public static int diagonalsum(int matrix[][]){
         int sum=0;
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             if(i==j){
    //                 sum+=matrix[i][j];
    //             }
    //             else if(i+j==matrix.length-1){
    //               sum+=matrix[i][j];
    //             }
    //         }
    //     }
    //     return sum;
    //  }
for(int i=0;i<matrix.length;i++){
    //pd
    sum+=matrix[i][i];
    //sd
    if(i !=matrix.length-1-i)
    sum+=matrix[i][matrix.length-i-1];
}
return sum;

    }
    public static boolean staircasesearch(int martix[][],int key){
        int row=0,col=martix[0].length-1;
        while (row<martix.length&&col>=0) {
            if(martix[row][col]==key){
                System.out.println("found key at("+row+","+col+")");
                return true;
            }
            else if (key<martix[row][col]){
                col--;

            }
            else{
                row++;
            }
            
        }
        System.out.println("not found");
        return false;
    }
    
    
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
                        int key=14;
                       // printspiral(matrix);
                       //  System.out.println(diagonalsum(matrix));
                       staircasesearch(matrix, key);
    }
}
