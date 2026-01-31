import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        
        // 1. "Apple" is passed to a hash function
        // 2. It generates a hash code (e.g., 12345)
        // 3. 12345 is compressed to fit array size (e.g., index 5)
        // 4. Value 100 is stored at index 5
        map.put("Apple", 100); 

        System.out.println("Value for Apple: " + map.get("Apple"));
    }
}
