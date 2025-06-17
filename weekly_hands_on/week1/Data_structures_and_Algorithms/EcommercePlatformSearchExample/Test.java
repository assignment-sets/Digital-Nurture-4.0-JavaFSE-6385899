
import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        for (int i = 0; i < products.length; i++) {
            products[i] = new Product(i + 1, String.format("product%d", i + 1), String.format("category%d", i + 1));
        }
        System.out.println("Original Array of Products");
        displayProducts(products);
        System.out.println("Linear Search Result for item at index 3");
        testLinearSearch(products);
        System.out.println("Binary Search Result for item at index 4");
        testBinSearch(products);
    }

    public static void testLinearSearch(Product[] products) {
        LinearSearch<Product> ls = new LinearSearch<>();
        int resultIdx = ls.search(products, products[3]);
        System.out.println("Item found at index : " + resultIdx);
    }

    public static void testBinSearch(Product[] products) {
        Arrays.sort(products, Comparator.comparingInt(Product::getProductId));
        BinarySearch<Product> bs = new BinarySearch<>();
        int resultIdx = bs.search(products, products[4], 0, products.length - 1);
        System.out.println("Item found at index : " + resultIdx);
    }

    public static void displayProducts(Product[] products) {
        Arrays.stream(products).forEach((prod) -> {
            System.out.println(prod.getProductName());
        });
    }
}
