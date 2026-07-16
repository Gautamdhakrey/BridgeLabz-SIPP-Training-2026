class Vehicle {

    private String vehicleNumber;
    private String ownerName;
    private String vehicleType;

    // Constructor
    public Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Getter
    public String getVehicleType() {
        return vehicleType;
    }

    // Display Vehicle Details
    public void displayDetails() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Owner Name     : " + ownerName);
        System.out.println("Vehicle Type   : " + vehicleType);
        System.out.println();
    }
}

public class SmartParkingManagement {

    // Display all cars
    public static void displayCars(Vehicle[] vehicles) {
        System.out.println("===== Cars =====");
        for (Vehicle v : vehicles) {
            if (v != null && v.getVehicleType().equalsIgnoreCase("Car")) {
                v.displayDetails();
            }
        }
    }

    // Display all bikes
    public static void displayBikes(Vehicle[] vehicles) {
        System.out.println("===== Bikes =====");
        for (Vehicle v : vehicles) {
            if (v != null && v.getVehicleType().equalsIgnoreCase("Bike")) {
                v.displayDetails();
            }
        }
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[10];

        vehicles[0] = new Vehicle("UP80AB101", "Gautam", "Car");
        vehicles[1] = new Vehicle("UP80AB102", "Rahul", "Bike");
        vehicles[2] = new Vehicle("UP80AB103", "Aman", "Car");
        vehicles[3] = new Vehicle("UP80AB104", "Rohit", "Bike");
        vehicles[4] = new Vehicle("UP80AB105", "Priya", "Car");
        vehicles[5] = new Vehicle("UP80AB106", "Anjali", "Bike");
        vehicles[6] = new Vehicle("UP80AB107", "Vikas", "Car");
        vehicles[7] = new Vehicle("UP80AB108", "Neha", "Bike");
        vehicles[8] = new Vehicle("UP80AB109", "Karan", "Car");
        vehicles[9] = new Vehicle("UP80AB110", "Simran", "Bike");

        displayCars(vehicles);
        displayBikes(vehicles);
    }
}