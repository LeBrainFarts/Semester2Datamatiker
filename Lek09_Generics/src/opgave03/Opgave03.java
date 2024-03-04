package opgave03;

import opgave03.models.ArrayListRing;

public class Opgave03 {
    public static void main(String[] args) {
        // Example usage of ArrayListRing with Integer elements
        ArrayListRing<Integer> ring = new ArrayListRing<>(5);

        // Add some elements to the ring
        ring.add(10);
        ring.add(20);
        ring.add(30);

        // Test getCurrentItem method
        try {
            System.out.println("Current Item: " + ring.getCurrentItem()); // Should print 30
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test advance method
        ring.advance(); // Move to the successor of the current item
        try {
            System.out.println("Current Item after advance: " + ring.getCurrentItem()); // Should print 20
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Add more elements to the ring
        ring.add(40);
        ring.add(50);

        // Test advance method after adding more elements
        ring.advance(); // Move to the successor of the current item
        try {
            System.out.println("Current Item after advance: " + ring.getCurrentItem()); // Should print 50
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
