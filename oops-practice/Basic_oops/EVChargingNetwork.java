class ChargingStation {

    // Static Variables
    private static int totalStations = 0;
    private static double electricityRate = 8.5; // ₹ per unit

    // Instance Variables
    private String stationId;
    private double unitsConsumed;

    // Constructor
    public ChargingStation(String stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    // Calculate Bill
    public double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    // Display Details
    public void displayStationDetails() {
        System.out.println("Station ID      : " + stationId);
        System.out.println("Units Consumed  : " + unitsConsumed);
        System.out.println("Rate per Unit   : ₹" + electricityRate);
        System.out.println("Total Bill      : ₹" + calculateBill());
        System.out.println();
    }

    // Static method to change electricity rate
    public static void setElectricityRate(double newRate) {
        electricityRate = newRate;
    }

    // Static method to display total stations
    public static void displayTotalStations() {
        System.out.println("Total Stations: " + totalStations);
    }
}

public class EVChargingNetwork {
    public static void main(String[] args) {

        ChargingStation s1 = new ChargingStation("CS101", 120);
        ChargingStation s2 = new ChargingStation("CS102", 150);
        ChargingStation s3 = new ChargingStation("CS103", 200);
        ChargingStation s4 = new ChargingStation("CS104", 175);
        ChargingStation s5 = new ChargingStation("CS105", 250);

        System.out.println("=== Initial Bills ===\n");

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        // Change electricity rate
        ChargingStation.setElectricityRate(10.0);

        System.out.println("=== After Rate Change ===\n");

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        ChargingStation.displayTotalStations();
    }
}