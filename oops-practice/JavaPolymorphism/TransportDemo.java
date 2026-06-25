// Superclass
class Vehicle {

    String vehicleName;

    Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    double fuelCost(int km) {
        return 0;
    }
}

// Car
class Car extends Vehicle {

    Car(String vehicleName) {
        super(vehicleName);
    }

    @Override
    double fuelCost(int km) {
        return km * 8;
    }
}

// Bus
class Bus extends Vehicle {

    Bus(String vehicleName) {
        super(vehicleName);
    }

    @Override
    double fuelCost(int km) {
        return km * 20;
    }
}

// Bike
class Bike extends Vehicle {

    Bike(String vehicleName) {
        super(vehicleName);
    }

    @Override
    double fuelCost(int km) {
        return km * 3;
    }
}

// New Class (No existing code changed)
class ElectricCar extends Vehicle {

    ElectricCar(String vehicleName) {
        super(vehicleName);
    }

    @Override
    double fuelCost(int km) {
        return km * 2;
    }
}

public class TransportDemo {

    public static void main(String[] args) {

        Vehicle fleet[] = {
                new Car("Honda"),
                new Bus("Volvo"),
                new Bike("Royal Enfield"),
                new ElectricCar("Tesla")
        };

        for (Vehicle v : fleet) {

            System.out.println(v.vehicleName +
                    " Fuel Cost = " + v.fuelCost(100));

            if (v instanceof Car)
                System.out.println("Type : Car");

            else if (v instanceof Bus)
                System.out.println("Type : Bus");

            else if (v instanceof Bike)
                System.out.println("Type : Bike");

            else if (v instanceof ElectricCar)
                System.out.println("Type : Electric Car");

            System.out.println();
        }
    }
}