public class basicsorting {
    public static void bubbleshort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
    }
     public static void selectionshort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                minpos=j;

            }
        }

       
        //swap
        int temp =arr[minpos];
        arr[minpos]=arr[i];
        arr[i]=temp;
    }
    }
    public static void  insertionshort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            //finging out the correct pos to insert
            while (prev>=0 && arr[prev]>curr) {
                arr[prev+1]=arr[prev];
                prev--;
                
            }
            //insertion
            arr[prev+1]=curr;
        }
    }
    

    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
   
    public static void main(String[] args) {
        int arr[]={5,1,4,3,2};
        insertionshort(arr);
        printarr(arr);
    }
}
