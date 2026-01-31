import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        
        // 1. NUMBER 
        int num = 1221;
        int temp = num, reversed = 0;
        while (temp > 0) {
            reversed = (reversed * 10) + (temp % 10);
            temp /= 10;
        }
        System.out.println("Is Number " + num + " Palindrome? " + (num == reversed));

        // 2. STRING 
        String str = "Racecar";
        String cleanStr = str.toLowerCase();
        boolean isStrPalindrome = true;
        for (int i = 0; i < cleanStr.length() / 2; i++) {
            if (cleanStr.charAt(i) != cleanStr.charAt(cleanStr.length() - 1 - i)) {
                isStrPalindrome = false;
                break;
            }
        }
        System.out.println("Is String '" + str + "' Palindrome? " + isStrPalindrome);

        // 3. ARRAY
        int[] arr = {1, 2, 3, 2, 1};
        boolean isArrPalindrome = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                isArrPalindrome = false;
                break;
            }
        }
        System.out.println("Is Array " + Arrays.toString(arr) + " Palindrome? " + isArrPalindrome);
    }
}
