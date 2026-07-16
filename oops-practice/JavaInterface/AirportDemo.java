// Interface 1
interface LuggageScanner {

    void scanLuggage();

    default void displaySecurityGuidelines() {
        System.out.println("Do not carry prohibited items.");
    }

    static boolean isPassportNumberValid(String passportNo) {
        return passportNo.length() == 8;
    }
}

// Interface 2
interface PassportVerifier {

    void verifyPassport();

    default void displaySecurityGuidelines() {
        System.out.println("Carry a valid passport and boarding pass.");
    }
}

// Implementing both interfaces
class AirportSecuritySystem implements LuggageScanner, PassportVerifier {

    @Override
    public void scanLuggage() {
        System.out.println("Luggage scanned successfully.");
    }

    @Override
    public void verifyPassport() {
        System.out.println("Passport verified.");
    }

    // Resolve default method conflict
    @Override
    public void displaySecurityGuidelines() {
        LuggageScanner.super.displaySecurityGuidelines();
        PassportVerifier.super.displaySecurityGuidelines();
    }

    public boolean canBoard(String passportNo) {
        return LuggageScanner.isPassportNumberValid(passportNo);
    }
}

// Main Class
public class AirportDemo {

    public static void main(String[] args) {

        String passengers[] = {"Rahul", "Priya", "Amit"};
        String passportNos[] = {"A1234567", "B1234", "C9876543"};

        AirportSecuritySystem security = new AirportSecuritySystem();

        security.displaySecurityGuidelines();
        System.out.println();

        for (int i = 0; i < passengers.length; i++) {

            System.out.println("Passenger : " + passengers[i]);

            security.scanLuggage();
            security.verifyPassport();

            if (security.canBoard(passportNos[i]))
                System.out.println("Status : Allowed to Board");
            else
                System.out.println("Status : Boarding Denied");

            System.out.println();
        }
    }
}