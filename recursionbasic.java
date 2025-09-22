public class recursionbasic {
    public static void printdec(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.print(n + " ");
        printdec(n - 1);
    }

    public static void printinc(int n) {

        if (n == 10) {
            System.out.println(10);
            return;
        }

        printinc(n - 1);
        System.out.print(n + " ");

    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fact(n - 1);
        return fn;
    }

    // natural nymber sum
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int Snm1 = sum(n - 1);
        int Sn = n + Snm1;
        return Sn;
    }

    // print nth fibonacci number
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    // ..,find the number postion /addres in arry
    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i + 1);
    }

    // last occurence
    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;

    }

    // calculte power 2^10
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int xnml = power(x, n - 1);
        int xn = x * xnml;
        return xn;

        // return x * power(x,x-1);
    }

    // optimized code of power is time complecity is o(log2n)
    public static int optimizedpower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedpower(a, n / 2);
        int halfPowersq = halfPower * halfPower;

        // n is od number
        if (n % 2 != 0) {
            halfPowersq = a * halfPowersq;
        }
        return halfPowersq;
    }

    // tells poblean find ways
    public static int tellingproblem(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;

        }
        // kaam
        // vertical choice
        int fnm1 = tellingproblem(n - 1);

        // hortizontal choice
        int fnm2 = tellingproblem(n - 2);

        int totways = fnm1 + fnm2;
        return totways;
    }

    // remove duplicate charcter
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        // kaam
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            // duplicate
            removeDuplicates(str, idx + 1, newStr, map);

        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);

        }
    }

    // In the party n freinds are go and one are single or two friend are in pair
    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // choice
        // single
        int fnm1 = friendsPairing(n - 1);

        // pair
        int fnm2 = friendsPairing(n - 2);
        int pairWays = (n - 1) * fnm2;

        // totWays
        int totWays = fnm1 + pairWays;
        return totWays;
    }

    // binary strings problem code
    public static void printBinString(int n, int lastPlace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        printBinString(n - 1, 0, str + "0");

        if (lastPlace == 0) {
            printBinString(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        // int n=27;
        // printinc(n);

        // System.out.println( fact(n));
        // System.out.println(sum(n));
        // System.out.println(fib(n));

        // int arr[]={1,3,4,5};
        // System.out.println(isSorted(arr, 0));

        // int arr[]={8,3,5,4,5,5,9,8,7,2};
        // System.out.println(firstOccurence(arr, 5, 0));
        // System.out.println(lastOccurence(arr, 5, 0));

        // System.out.println(power(2, 10));
        // int a =2;
        // int n=10;
        // System.err.println(optimizedpower(2, 10));

        // System.out.println(tellingproblem(4));
        // String str ="gggjjwidgggrigglsj";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

        // System.out.println(friendsPairing(4));

        printBinString(3, 0, "");
    }
}
