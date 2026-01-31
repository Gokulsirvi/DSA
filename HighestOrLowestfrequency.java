import java.util.*;

public class HighestOrLowestfrequency {
    public static void main(String[] args) {
        int[] arr = {10, 5, 10, 15, 10, 5, 1};
        
        // Step 1: Hashing to count frequencies
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // Step 2: Traverse map to find highest and lowest
        int maxFreq = 0, minFreq = arr.length;
        int maxElement = -1, minElement = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();

            // Check for Highest Frequency
            if (count > maxFreq) {
                maxFreq = count;
                maxElement = element;
            }

            // Check for Lowest Frequency
            if (count < minFreq) {
                minFreq = count;
                minElement = element;
            }
        }

        System.out.println("Highest Frequency Element: " + maxElement + " (Count: " + maxFreq + ")");
        System.out.println("Lowest Frequency Element: " + minElement + " (Count: " + minFreq + ")");
    }
}
