import java.util.*;

// Base Category
abstract class Category {
    String categoryName;

    Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public String toString() {
        return categoryName;
    }
}

// Categories
class BookCategory extends Category {
    BookCategory() {
        super("Books");
    }
}

class ClothingCategory extends Category {
    ClothingCategory() {
        super("Clothing");
    }
}

class GadgetCategory extends Category {
    GadgetCategory() {
        super("Gadgets");
    }
}

// Generic Product Class
class Product<T extends Category> {

    String name;
    double price;
    T category;

    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    void display() {
        System.out.println("Product : " + name);
        System.out.println("Category : " + category);
        System.out.println("Price : " + price);
        System.out.println();
    }
}

// Generic Method
class Marketplace {

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.price = product.price - (product.price * percentage / 100);
    }
}

// Driver Class
public class MarketplaceDemo {

    public static void main(String[] args) {

        Product<BookCategory> book =
                new Product<>("Java Programming", 500, new BookCategory());

        Product<ClothingCategory> shirt =
                new Product<>("T-Shirt", 1000, new ClothingCategory());

        Product<GadgetCategory> laptop =
                new Product<>("Laptop", 60000, new GadgetCategory());

        List<Product<?>> catalog = new ArrayList<>();

        catalog.add(book);
        catalog.add(shirt);
        catalog.add(laptop);

        Marketplace.applyDiscount(book, 10);
        Marketplace.applyDiscount(shirt, 20);
        Marketplace.applyDiscount(laptop, 15);

        System.out.println("Product Catalog\n");

        for (Product<?> p : catalog) {
            p.display();
        }
    }
}