import java.util.*;

public class FrequencyOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 3, 2, 2, 2, 5, 1};
        
        // Step 1: Find the max element to determine "hash table" size
        int max = 0;
        for (int x : arr) if (x > max) max = x;

        // Step 2: Create our own hash array (index is the number, value is count)
        int[] hash = new int[max + 1];

        // Step 3: Map elements to indices (The Hashing Step)
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        // Step 4: Query the frequency
        System.out.println("Frequency of 2: " + hash[2]); // Output: 4
        System.out.println("Frequency of 8: " + hash[8]); // Output: 1
        // int[] arr = {1, 2, 1, 3, 2, 1, 4};
        
        // // Hashing to count frequency
        // Map<Integer, Integer> map = new HashMap<>();
        
        // for (int x : arr) {
        //     map.put(x, map.getOrDefault(x, 0) + 1);
        // }
        
        // System.out.println("Frequencies: " + map);
        // // Output: {1=3, 2=2, 3=1, 4=1}
    }
}
