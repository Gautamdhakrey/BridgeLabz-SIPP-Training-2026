// Superclass
class Vehicle {
    String vehicleNumber;
    String ownerName;

    Vehicle(String vehicleNumber, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }

    double calculateToll() {
        return 0;
    }

    void display() {
        System.out.println(vehicleNumber + " | " + ownerName);
    }
}

// Car
class Car extends Vehicle {
    Car(String number, String owner) {
        super(number, owner);
    }

    @Override
    double calculateToll() {
        return 100;
    }
}

// Bus
class Bus extends Vehicle {
    Bus(String number, String owner) {
        super(number, owner);
    }

    @Override
    double calculateToll() {
        return 250;
    }
}

// Truck
class Truck extends Vehicle {
    Truck(String number, String owner) {
        super(number, owner);
    }

    @Override
    double calculateToll() {
        return 400;
    }
}

public class TollManagement {

    static void calculateTotalRevenue(Vehicle[] vehicles) {
        double total = 0;

        for (Vehicle v : vehicles)
            total += v.calculateToll();

        System.out.println("Total Revenue = ₹" + total);
    }

    static void searchVehicle(Vehicle[] vehicles, String number) {

        for (Vehicle v : vehicles) {

            if (v.vehicleNumber.equals(number)) {
                System.out.println("Vehicle Found");
                v.display();
                return;
            }
        }

        System.out.println("Vehicle Not Found");
    }

    public static void main(String[] args) {

        Vehicle vehicles[] = {
                new Car("UP80A1", "Rahul"),
                new Bus("DL10B2", "Amit"),
                new Truck("MP20C3", "Rohit"),
                new Truck("RJ11D4", "Karan")
        };

        calculateTotalRevenue(vehicles);

        searchVehicle(vehicles, "MP20C3");

        Vehicle highest = vehicles[0];

        int cars = 0, buses = 0, trucks = 0;

        for (Vehicle v : vehicles) {

            if (v.calculateToll() > highest.calculateToll())
                highest = v;

            if (v instanceof Car)
                cars++;

            else if (v instanceof Bus)
                buses++;

            else if (v instanceof Truck)
                trucks++;
        }

        System.out.println("\nHighest Toll Paid");
        highest.display();

        System.out.println("\nCars : " + cars);
        System.out.println("Buses : " + buses);
        System.out.println("Trucks : " + trucks);
    }
}