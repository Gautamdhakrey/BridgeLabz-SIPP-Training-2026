import java.util.ArrayList;

public class SmartParking {

    static ArrayList<String> parking = new ArrayList<>();

    public static void enterVehicle(String number) {
        parking.add(number);
        System.out.println(number + " Entered");
    }

    public static void exitVehicle(String number) {

        if (parking.remove(number))
            System.out.println(number + " Exited");
        else
            System.out.println("Vehicle Not Found");
    }

    public static void searchVehicle(String number) {

        if (parking.contains(number))
            System.out.println("Vehicle is Parked");
        else
            System.out.println("Vehicle Not Parked");
    }

    public static void display() {

        System.out.println("\nParked Vehicles");

        for (String s : parking)
            System.out.println(s);

        System.out.println("Occupied Slots = " + parking.size());
    }

    public static void main(String[] args) {

        enterVehicle("UP80AB1234");
        enterVehicle("DL01CD5678");
        enterVehicle("RJ14XY9999");

        searchVehicle("DL01CD5678");

        exitVehicle("UP80AB1234");

        display();
    }
}