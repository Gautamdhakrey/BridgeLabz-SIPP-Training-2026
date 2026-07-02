import java.util.*;

// Abstract Class
abstract class WarehouseItem {
    String name;

    WarehouseItem(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

// Child Classes
class Electronics extends WarehouseItem {
    Electronics(String name) {
        super(name);
    }
}

class Groceries extends WarehouseItem {
    Groceries(String name) {
        super(name);
    }
}

class Furniture extends WarehouseItem {
    Furniture(String name) {
        super(name);
    }
}

// Generic Class
class Storage<T extends WarehouseItem> {

    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

// Wildcard Class
class WarehouseUtility {

    public static void displayItems(List<? extends WarehouseItem> list) {
        for (WarehouseItem item : list) {
            System.out.println(item);
        }
    }
}

// Driver Class
public class WarehouseDemo {

    public static void main(String[] args) {

        Storage<Electronics> electronics = new Storage<>();
        electronics.addItem(new Electronics("Laptop"));
        electronics.addItem(new Electronics("Mobile"));

        Storage<Groceries> groceries = new Storage<>();
        groceries.addItem(new Groceries("Rice"));
        groceries.addItem(new Groceries("Sugar"));

        Storage<Furniture> furniture = new Storage<>();
        furniture.addItem(new Furniture("Chair"));
        furniture.addItem(new Furniture("Table"));

        System.out.println("Electronics:");
        WarehouseUtility.displayItems(electronics.getItems());

        System.out.println("\nGroceries:");
        WarehouseUtility.displayItems(groceries.getItems());

        System.out.println("\nFurniture:");
        WarehouseUtility.displayItems(furniture.getItems());
    }
}