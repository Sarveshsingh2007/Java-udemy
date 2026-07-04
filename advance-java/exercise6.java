import java.util.*;

public class exercise6 {
    public static void main(String[] args){
        List<String> products = Arrays.asList("Laptop", "Pen", "Notebook", "Headphones", "Smartphone");
        
        System.out.println("Original products: " + products);

        List<String> UpdatedProducts = products.stream()
                                                .filter(product -> product.length() > 5)
                                                .map(product -> product.toUpperCase())
                                                .sorted()
                                                .toList();

        System.out.println("Updated products:  " + UpdatedProducts);                                        
    }
}
