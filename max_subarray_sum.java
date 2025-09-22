public class max_subarray_sum {
    public static void printsumsubarrys(int number[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = 1; j < number.length; j++) {
                int end = j;
                currsum = 0;
                for (int k = start; k <= end; k++) {
                    currsum += number[k];
                }
                System.out.print(currsum);
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.print("max sum=" + maxsum);
    }

    public static void kadanes(int number[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < number.length; i++) {
            cs = cs + number[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.print("our max subarry sum is" + ms);
    }

    public static void main(String[] args) {
        int number[] = { 1, -2, 6, -1, 3 };
        printsumsubarrys(number);
        kadanes(number);
    }
}
