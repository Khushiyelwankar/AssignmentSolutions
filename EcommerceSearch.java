import java.util.ArrayList;
import java.util.List;

public class EcommerceSearch {

    public static List<String> searchProducts(String keyword, List<String> products) {
        List<String> result = new ArrayList<>();
        for (String product : products) {
            if (product.toLowerCase().contains(keyword.toLowerCase())) {
                result.add(product);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> products = new ArrayList<>();
        products.add("Apple iPhone 14");
        products.add("Samsung Galaxy S23");
        products.add("Sony Bluetooth Headphones");
        products.add("Dell Inspiron Laptop");
        products.add("Canon DSLR Camera");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product keyword to search: ");
        String keyword = scanner.nextLine();