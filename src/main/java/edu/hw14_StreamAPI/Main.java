package edu.hw14_StreamAPI;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("1984","Book", 270.0, LocalDateTime.now().minusDays(1)));
        products.add(new Product("Forbes","Magazine", 140.0, 10.0, LocalDateTime.now().minusDays(3)));
        products.add(new Product("Antifragility" ,"Book", 200.0, 10.0, LocalDateTime.now().minusDays(5)));
        products.add(new Product("The Witcher" ,"Book", 70.0, 10.0, LocalDateTime.now().minusDays(5)));
        products.add(new Product("Churchill factor" ,"Book", 65.0, 10.0, LocalDateTime.now().minusDays(5)));
        products.add(new Product("The Times","Newspaper", 70.0, 5.0, LocalDateTime.now().minusDays(2)));
        products.add(new Product("Sapiens","Book", 300.0, 10.0, LocalDateTime.now().minusDays(10)));
        products.add(new Product("The Amazing Spider-men","Comics", 200.0, 25.0, LocalDateTime.now().minusDays(377)));

        System.out.println("\n1 Type + height price--------------------------------------------------------");
        List<Product> expansiveBooksList = products.stream().filter(product -> "Book".equals(product.getType()) && product.getPrice() > 250.0).collect(Collectors.toList());
        expansiveBooksList.forEach(product -> System.out.println("Name: " + product.getName() + " | Type: " + product.getType() + " | Price: " + product.getPrice()));

        System.out.println("\n2 Type + discount--------------------------------------------------------");
        List<Product> booksAtASpecificDiscount = products.stream().filter(product -> "Book".equals(product.getType()) && product.getPercentOfDiscount() == 10).collect(Collectors.toList());
        booksAtASpecificDiscount.forEach(product -> System.out.println("Name: " + product.getName() + " | Type: " + product.getType() + " | Final price: " + (product.getPrice() - (product.getPrice() / 100.0 * product.getPercentOfDiscount()))));

        System.out.println("\n3 Type + minPrice--------------------------------------------------------");
        Product cheapestBook = products.stream().filter(product -> "Book".equals(product.getType())).min((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice())).orElseThrow(() -> new NoSuchElementException("There is any book"));
        System.out.println("Name: " + cheapestBook.getName() + " | Type: " + cheapestBook.getType() + " | Price: " + cheapestBook.getPrice() + " | This book have the lowest price");

        System.out.println("\n4 latest date--------------------------------------------------------");
        List<Product> lastAdds = products.stream().sorted((p1, p2) -> p2.getDateOfAdd().compareTo(p1.getDateOfAdd())).limit(3).collect(Collectors.toList());
        lastAdds.forEach(product -> System.out.println("Name: " + product.getName() + " | Type: " + product.getType() + " | Price: " + product.getPrice() + " | Date of add to the list: " + product.getDateOfAdd().getYear() + " " + product.getDateOfAdd().getMonth() + " " + product.getDateOfAdd().getDayOfMonth()));

        System.out.println("\n5 Sum of products--------------------------------------------------------");
        int currentYear = LocalDateTime.now().getYear();
        double sumOfProducts = products.stream().filter(product -> "Book".equals(product.getType()) && product.getDateOfAdd().getYear() == currentYear && product.getPrice() < 75).mapToDouble(Product::getPrice).sum();
        System.out.println(sumOfProducts);

        System.out.println("\n6 Sum of products--------------------------------------------------------");
        Map<String, List<Product>> groupedProducts = products.stream().collect(Collectors.groupingBy(Product::getType));
        groupedProducts.forEach((type, productList) -> {System.out.println(type + ":"); productList.forEach(product -> System.out.println("    " + product.getName()));});
    }
}
