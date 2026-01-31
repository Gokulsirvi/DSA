import java.util.Scanner;

public class Basic{

    // -------- Function: Call by Value --------
    static void callByValue(int x) {
        x = 100;
    }

    // -------- Function: Call by Reference --------
    static void callByReference(int arr[]) {
        arr[0] = 100;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== INPUT / OUTPUT =====
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("You entered: " + num);

        // ===== DATA TYPES =====
        int a = 10;
        float b = 5.5f;
        char c = 'A';
        boolean flag = true;
        String name = "Java";

        System.out.println("\nData Types:");
        System.out.println(a + " " + b + " " + c + " " + flag + " " + name);

        // ===== IF ELSE =====
        if (num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        // ===== LOOP (FOR LOOP) =====
        System.out.println("\nFor Loop:");
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }

        // ===== ARRAY =====
        int[] arr = {10, 20, 30};
        System.out.println("\nArray Elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // ===== STRING =====
        String s = "Hello";
        System.out.println("\nString: " + s);
        System.out.println("Length: " + s.length());

        // ===== SWITCH =====
        int choice = 2;
        System.out.println("\nSwitch Case:");
        switch (choice) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            default:
                System.out.println("INVALID");
        }

        // ===== CALL BY VALUE =====
        int x = 50;
        callByValue(x);
        System.out.println("\nAfter Call by Value: " + x);

        // ===== CALL BY REFERENCE =====
        callByReference(arr);
        System.out.println("After Call by Reference: " + arr[0]);
    }
}