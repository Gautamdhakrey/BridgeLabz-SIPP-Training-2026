class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBilling {

    public static void processBill(int totalAmount, int items,
                                   int[] patients, int patientIndex,
                                   String amountPaid)
            throws InsufficientFundsException {

        try {
            int costPerItem = totalAmount / items;
            System.out.println("Cost Per Item: " + costPerItem);

            System.out.println("Patient ID: " + patients[patientIndex]);

            int paid = Integer.parseInt(amountPaid);

            if (paid < totalAmount) {
                throw new InsufficientFundsException(
                        "Payment failed. Required: ₹" + totalAmount +
                        ", Paid: ₹" + paid);
            }

            System.out.println("Payment Successful");

        } catch (ArithmeticException e) {
            System.out.println("Error: Number of items cannot be zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid payment amount.");
        }
    }

    public static void main(String[] args) {
        int[] patients = {101, 102, 103};

        try {
            processBill(5000, 0, patients, 1, "4500");
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}