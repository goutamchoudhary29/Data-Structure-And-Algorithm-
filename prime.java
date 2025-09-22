public class prime{

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false; // 0 and 1 are not prime
        for (int i = 2; i <= Math.sqrt(n); i++) { // optimized till sqrt(n)
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to print all primes in range 2 to n
    public static void primesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test single number
        boolean a = isPrime(8);
        System.out.println("Is 8 prime? " + a);

        // Print primes in range
        System.out.println("Primes up to 20:");
        primesInRange(20);
    }
}
