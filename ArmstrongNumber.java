public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153; // Example: 1^3 + 5^3 + 3^3 = 153
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        
        // 1. Find number of digits
        int digits = String.valueOf(num).length();

        // 2. Calculate sum of digits raised to the power
        while (num > 0) {
            int lastDigit = num % 10;
            sum += Math.pow(lastDigit, digits);
            num /= 10;
        }

        // 3. Compare sum with original
        return sum == originalNum;
    }
}
