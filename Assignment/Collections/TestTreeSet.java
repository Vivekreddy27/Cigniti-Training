import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        // Create a TreeSet of product names
        TreeSet<String> productSet = new TreeSet<>();

        // Store different product names (including duplicates)
        productSet.add("Laptop");
        productSet.add("Phone");
        productSet.add("Tablet");
        productSet.add("Phone"); // Adding a duplicate product name
        productSet.add("Headphones");

        // Print all product names using an iterator
        System.out.println("All product names:");
        Iterator<String> iterator = productSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Print the first and last product names
        if (!productSet.isEmpty()) {
            System.out.println("First product: " + productSet.first());
            System.out.println("Last product: " + productSet.last());
        } else {
            System.out.println("The TreeSet is empty.");
        }

        // Print the size of the TreeSet
        System.out.println("Size of the TreeSet: " + productSet.size());

        // Remove a particular product from the TreeSet
        String productToRemove = "Tablet";
        if (productSet.contains(productToRemove)) {
            productSet.remove(productToRemove);
            System.out.println(productToRemove + " has been removed.");
        } else {
            System.out.println(productToRemove + " not found in the TreeSet.");
        }

        // Verify the size of the TreeSet after removal
        System.out.println("Size of the TreeSet after removal: " + productSet.size());
    }
}
