import java.util.Arrays;

public class Recursion {

    public static void main(String[] args) {
        System.out.println("--- 1. Print Name 5 Times ---");
        printName(1, 5);

        System.out.println("\n--- 2. Print 1 to 5 ---");
        print1ToN(1, 5);

        System.out.println("\n--- 3. Print 5 to 1 ---");
        printNTo1(5);

        System.out.println("\n--- 4. Sum of first 5 numbers ---");
        System.out.println("Sum: " + sumN(5));

        System.out.println("\n--- 5. Factorial of 5 ---");
        System.out.println("Factorial: " + factorial(5));

        System.out.println("\n--- 6. Reverse Array ---");
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr, 0, arr.length - 1);
        System.out.println("Reversed: " + Arrays.toString(arr));

        System.out.println("\n--- 7. Check Palindrome ---");
        String s = "MADAM";
        System.out.println("Is '" + s + "' palindrome? " + isPalindrome(s, 0));

        System.out.println("\n--- 8. Fibonacci Number (at index 6) ---");
        System.out.println("Fibonacci at 6: " + fibonacci(6));
    }

    // 1. Print name N times
    static void printName(int i, int n) {
        if (i > n) return;
        System.out.println("Gokul");
        printName(i + 1, n);
    }

    // 2. Print 1 to N
    static void print1ToN(int i, int n) {
        if (i > n) return;
        System.out.print(i + " ");
        print1ToN(i + 1, n);
    }

    // 3. Print N to 1
    static void printNTo1(int n) {
        if (n < 1) return;
        System.out.print(n + " ");
        printNTo1(n - 1);
    }

    // 4. Sum of first N numbers
    static int sumN(int n) {
        if (n == 0) return 0;
        return n + sumN(n - 1);
    }

    // 5. Factorial of N
    static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    // 6. Reverse an Array
    static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) return;
        // Swap
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1, end - 1);
    }

    // 7. Check Palindrome (String)
    static boolean isPalindrome(String s, int i) {
        if (i >= s.length() / 2) return true;
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        return isPalindrome(s, i + 1);
    }

    // 8. Fibonacci Number
    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
