import java.util.Vector;
import java.util.Arrays;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector
        Vector<String> vector = new Vector<>();

        // Add elements to the Vector
        vector.addElement("Apple");
        vector.add("Banana");
        vector.addAll(Arrays.asList("Cherry", "Date", "Elderberry"));

        // Print the Vector
        System.out.println("Vector: " + vector);

        // Check if an element exists in the Vector
        System.out.println("Contains 'Banana': " + vector.contains("Banana"));

        // Remove an element from the Vector
        vector.remove("Cherry");
        System.out.println("Vector after removing 'Cherry': " + vector);

        // Get the first element of the Vector
        System.out.println("First element: " + vector.firstElement());

        // Get the last element of the Vector
        System.out.println("Last element: " + vector.lastElement());

        // Get the element at a specific index
        System.out.println("Element at index 2: " + vector.elementAt(2));

        // Set an element at a specific index
        vector.set(2, "Dragon Fruit");
        System.out.println("Vector after setting element at index 2: " + vector);

        // Iterate over the elements of the Vector
        System.out.println("Iterating over the Vector:");
        for (String element : vector) {
            System.out.println(element);
        }

        // Check if the Vector is empty
        System.out.println("Is Vector empty? " + vector.isEmpty());

        // Clear the Vector
        vector.clear();
        System.out.println("Vector after clearing: " + vector);
    }
}