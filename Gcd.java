public class Gcd {
    public static void main(String[] args) {
        int a = 60, b = 48;
        System.out.println("GCD of " + a + " and " + b + " is: " + findGCD(a, b));
    }
    public static int getHCF(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
    }
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}
