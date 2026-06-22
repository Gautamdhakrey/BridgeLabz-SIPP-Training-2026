class Drone {

    // Instance Variables
    private String droneId;
    private int batteryPercentage;

    // Static Variable
    private static String companyName = "SkyLogistics";

    // Constructor
    public Drone(String droneId, int batteryPercentage) {
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    // Method to start delivery
    public void startDelivery() {
        if (batteryPercentage >= 20) {
            System.out.println(droneId + " started delivery.");
            batteryPercentage -= 20;
        } else {
            System.out.println(droneId + " has low battery. Cannot start delivery.");
        }
    }

    // Method to display status
    public void displayStatus() {
        System.out.println("Company Name      : " + companyName);
        System.out.println("Drone ID          : " + droneId);
        System.out.println("Battery Percentage: " + batteryPercentage + "%");
        System.out.println();
    }
}

public class DroneDeliverySystem {
    public static void main(String[] args) {

        Drone d1 = new Drone("DR101", 100);
        Drone d2 = new Drone("DR102", 60);
        Drone d3 = new Drone("DR103", 15);

        d1.startDelivery();
        d2.startDelivery();
        d3.startDelivery();

        System.out.println("\nDrone Status:\n");

        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();
    }
}