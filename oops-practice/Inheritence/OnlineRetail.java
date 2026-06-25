// Base Class
class Order {

    int orderId;
    String orderDate;

    // Constructor
    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method
    String getOrderStatus() {
        return "Order Placed";
    }

    // Display Order Details
    void displayInfo() {
        System.out.println("Order ID      : " + orderId);
        System.out.println("Order Date    : " + orderDate);
    }
}

// First Level Child Class
class ShippedOrder extends Order {

    String trackingNumber;

    // Constructor
    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Tracking No   : " + trackingNumber);
    }
}

// Second Level Child Class
class DeliveredOrder extends ShippedOrder {

    String deliveryDate;

    // Constructor
    DeliveredOrder(int orderId, String orderDate,
                   String trackingNumber, String deliveryDate) {

        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order Delivered";
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Delivery Date : " + deliveryDate);
        System.out.println("Status        : " + getOrderStatus());
    }
}

// Main Class
public class OnlineRetail {

    public static void main(String[] args) {

        DeliveredOrder order = new DeliveredOrder(
                101,
                "25-06-2026",
                "TRK123456",
                "28-06-2026"
        );

        order.displayInfo();
    }
}