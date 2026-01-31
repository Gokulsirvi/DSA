public class PrimeCheck {
    public static void main(String[] args) {
        int n = 29;
        System.out.println(n + " is prime? " + isPrime(n));
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;      // 0 and 1 are not prime
        if (n == 2 || n == 3) return true; // 2 and 3 are prime
        if (n % 2 == 0 || n % 3 == 0) return false; // Rule out even and multiples of 3

        // Optimized loop: check up to sqrt(n)
        // We skip even numbers by using i += 6 logic (6k ± 1 rule)
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
