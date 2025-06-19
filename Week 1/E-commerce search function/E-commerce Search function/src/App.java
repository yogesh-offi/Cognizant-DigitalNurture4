import java.util.Arrays;
import java.util.Comparator;

public class App {

    // Linear Search by product name
    public static Product linearSearch(Product[] products, String target) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(target)) {
                return p;
            }
        }
        return null;
    }

    // Binary Search by product name (array must be sorted)
    public static Product binarySearch(Product[] products, String target) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(target);
            if (cmp == 0)
                return products[mid];
            else if (cmp < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Fashion"),
            new Product(103, "Phone", "Electronics"),
            new Product(104, "Watch", "Accessories")
        };

        System.out.println("Linear Search for 'Phone':");
        Product result1 = linearSearch(products, "Phone");
        System.out.println(result1 != null ? result1 : "Not found");

        // Sort array before binary search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        System.out.println("\nBinary Search for 'Phone':");
        Product result2 = binarySearch(products, "Phone");
        System.out.println(result2 != null ? result2 : "Not found");
    }
}
