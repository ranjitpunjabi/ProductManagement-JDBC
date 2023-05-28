import java.util.*;

public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductService();
        service.addProduct(new Product("Type C", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Mac Studio", "Computer", "White Table", 2025));
        service.addProduct(new Product("Focusrite Mixer", "Audio System", "White Table", 2025));
        service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Drawer", 2021));
        service.addProduct(new Product("Asus Rog", "Laptop", "Black Table", 2021));
        service.addProduct(new Product("Macbook pro", "Laptop", "Brown Drawer", 2022));
        service.addProduct(new Product("Wacom Pad", "Writing Pad", "Black Drawer", 2020));
        service.addProduct(new Product("Apple Keyboard", "Keyboard", "White Table", 2022));
        service.addProduct(new Product("Logitech Keyboard", "Keyboard", "Black Table", 2024));
        service.addProduct(new Product("Hdmi cable", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Java Black Book", "Cable", "Shelf", 2024));
        service.addProduct(new Product("Logi Mouse", "Mouse", "Black Table", 2022));
        service.addProduct(new Product("Apple Mouse", "Mouse", "White Table", 2022));
        service.addProduct(new Product("Lenovo Mouse", "Mouse", "Black Drawer", 2022));
        service.addProduct(new Product("BlackBeast", "Computer", "White Table", 2020));

        System.out.println("\n============ Get all Products ================");
        List<Product> products = service.getAllProducts();
        printList(products);

        System.out.println("\n============ Particular Product ================");
        Product p = service.getProductByName("Logi Mouse");
        System.out.println(p);

        System.out.println("\n============ Particular Place ================");
        List<Product> productList = service.getProductsByPlace("Black Drawer");
        printList(productList);

        System.out.println("\n============ Out of Warranty products ================");
        List<Product> outOfWarrantyProducts = service.getOutOfWarrantyProducts();
        printList(outOfWarrantyProducts);

        System.out.println("\n============ Search Products by Text ================");
        List<Product> textProducts = service.getProductsWithText("black");
        printList(textProducts);

    }

    public static void printList(List<Product> products){
        // Enhanced For Loop
//        for(Product p : products){
//            System.out.println(p);
//        }

        // Using ForEach and method referencing
        products.forEach(System.out::println);
    }

}