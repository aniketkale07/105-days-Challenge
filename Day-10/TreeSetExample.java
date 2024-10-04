import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Date");
        treeSet.add("Elderberry");

        // Print the TreeSet
        System.out.println("TreeSet: " + treeSet);

        // Check if an element exists in the TreeSet
        System.out.println("Contains 'Banana': " + treeSet.contains("Banana"));

        // Remove an element from the TreeSet
        treeSet.remove("Cherry");
        System.out.println("TreeSet after removing 'Cherry': " + treeSet);

        // Get the first element of the TreeSet
        System.out.println("First element: " + treeSet.first());

        // Get the last element of the TreeSet
        System.out.println("Last element: " + treeSet.last());

        // Get the element lower than a given element
        System.out.println("Lower than 'Elderberry': " + treeSet.lower("Elderberry"));

        // Get the element higher than a given element
        System.out.println("Higher than 'Date': " + treeSet.higher("Date"));

        // Get the floor and ceiling of a given element
        System.out.println("Floor of 'Elderberry': " + treeSet.floor("Elderberry"));
        System.out.println("Ceiling of 'Date': " + treeSet.ceiling("Date"));

        // Poll the first element of the TreeSet
        System.out.println("Poll first element: " + treeSet.pollFirst());
        System.out.println("TreeSet after polling first element: " + treeSet);

        // Iterate over the elements of the TreeSet
        System.out.println("Iterating over the TreeSet:");
        for (String element : treeSet) {
            System.out.println(element);
        }

        // Check if the TreeSet is empty
        System.out.println("Is TreeSet empty? " + treeSet.isEmpty());

        // Clear the TreeSet
        treeSet.clear();
        System.out.println("TreeSet after clearing: " + treeSet);
    }
}