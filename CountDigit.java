public class CountTotalDigits {
    public static void main(String[] args) {
        long number = 9876543210L;
        
        int count = 0;
        long temp = number;
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        //Easy Method
        int stringCount = String.valueOf(Math.abs(number)).length();

        System.out.println("Total Digits: " + stringCount);
    }
}
