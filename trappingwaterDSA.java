public class trappingwaterDSA {
    public static int trappRainwater(int height[]){
        int n =height.length;
        //calculete max boundry of left side-auxiliary array
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }
        // calculate rightmax boundry
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i], rightMax[i+1]);
        }
        int trapwater=0;
        for(int i=0;i<n;i++){
         int waterlevel=Math.min(leftMax[i], rightMax[i]);
         trapwater+=waterlevel-height[i];
        }
        return trapwater;
    }
    public static int buyandsellstocks(int price[]){
        int maxprofit=0;
        int buyprice=Integer.MAX_VALUE;
        for(int i=0;i<price.length;i++){
            if(buyprice<price[i]){
                int profit=price[i]-buyprice;
                 maxprofit=Math.max(maxprofit, profit);

            }
            else{
                buyprice=price[i];
            }

        }
        return maxprofit;

    }
    public static void main(String[] args) {
        //int height[]={4,2,0,6,3,2,5};
        int price[]={7,1,5,3,6,4};
        
        
        //System.out.println("trap Rain water is"+trappRainwater(height));
        System.out.println("max profit is =  "+buyandsellstocks(price));
    }
}
