import java.io.*;

public class InventoryChecker {
    public static void main(String[] args) {

        try (BufferedReader br =
                     new BufferedReader(new FileReader("inventory.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split("-");

                String product = data[0];
                int quantity = Integer.parseInt(data[1]);

                if (quantity == 0) {
                    System.out.println(product + " is out of stock");
                }
            }

        } catch (IOException e) {
            System.out.println("File error.");
        }
    }
}