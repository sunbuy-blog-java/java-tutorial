package concurrentmap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapExample {
    public static void main(String[] args) {
        ConcurrentMap<String, Integer> inventory = new ConcurrentHashMap<>();
        // Adding initial inventory items
        inventory.put("Apple", 100);
        inventory.put("Banana", 100);
        inventory.put("Orange", 100);
        // Creating multiple threads to update inventory
        Runnable updateInventory = () -> {
            for (int i = 0; i < 10; i++) {
                updateInventoryCount(inventory, "Apple", -5); // Simulate decrease in Apple count
                updateInventoryCount(inventory, "Banana", -3); // Simulate decrease in Banana count
            }
        };
        Thread thread1 = new Thread(updateInventory);
        Thread thread2 = new Thread(updateInventory);
        // Start the threads
        thread1.start();
        thread2.start();
        // Wait for threads to complete
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Display final inventory
        System.out.println("Final Inventory:");
        inventory.forEach((item, count) -> System.out.println(item + ": " + count));
    }
    // Method to update inventory count atomically
    private static void updateInventoryCount(ConcurrentMap<String, Integer> inventory, String item, int change) {
        inventory.merge(item, change, Integer::sum);
    }
}
