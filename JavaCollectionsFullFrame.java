import java.util.*;

public class JavaCollectionsFullFrame {
    public static void main(String[] args) {
        
        System.out.println("--- 1. LIST (ArrayList, LinkedList, Vector) ---");
        List<String> list = new ArrayList<>();
        list.add("Apple");          // Add element
        list.add(1, "Banana");      // Insert at index
        list.set(0, "Cherry");      // Update/Replace
        System.out.println("List: " + list + " | Get Index 0: " + list.get(0));

        System.out.println("\n--- 2. STACK (LIFO: Last-In-First-Out) ---");
        Stack<String> stack = new Stack<>();
        stack.push("Bottom");       // Push to top
        stack.push("Middle");
        stack.push("Top");
        System.out.println("Stack: " + stack);
        System.out.println("Pop (Remove Top): " + stack.pop());
        System.out.println("Peek (Look at Top): " + stack.peek());

        System.out.println("\n--- 3. QUEUE & DEQUE (FIFO & Double-Ended) ---");
        Queue<String> queue = new PriorityQueue<>(); 
        queue.offer("Task 1");      // Preferred over add() in Queues
        queue.offer("Task 2");
        System.out.println("Queue Poll (Remove Head): " + queue.poll());

        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Front");
        deque.addLast("Back");
        System.out.println("Deque: " + deque);

        System.out.println("\n--- 4. SET (HashSet, LinkedHashSet, TreeSet) ---");
        Set<Integer> set = new TreeSet<>(); // Sorted naturally
        set.add(50);
        set.add(10);
        set.add(50); // Duplicate - will be ignored
        System.out.println("Sorted Set (Unique): " + set + " | Contains 10? " + set.contains(10));

        System.out.println("\n--- 5. MAP (HashMap, LinkedHashMap, TreeMap) ---");
        Map<String, String> map = new HashMap<>();
        map.put("ID_01", "Alice");   // Add Key-Value
        map.put("ID_02", "Bob");
        map.putIfAbsent("ID_01", "New"); // Won't change because key exists
        
        System.out.println("Map Value for ID_01: " + map.get("ID_01"));
        System.out.println("All Keys: " + map.keySet());
        System.out.println("All Values: " + map.values());

        System.out.println("\n--- 6. UTILITY FUNCTIONS (Collections Class) ---");
        List<Integer> nums = new ArrayList<>(Arrays.asList(4, 1, 9, 3));
        Collections.sort(nums);      // Sort
        Collections.reverse(nums);   // Reverse
        System.out.println("Utility Sorted/Reversed: " + nums);
    }
}