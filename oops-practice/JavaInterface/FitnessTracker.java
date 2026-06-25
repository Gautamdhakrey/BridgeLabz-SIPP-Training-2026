// Interface 1
interface Trackable {

    void logActivity();

    default void resetData() {
        System.out.println("Fitness data has been reset.");
    }
}

// Interface 2
interface Reportable {

    void generateReport();
}

// Interface 3
interface Notifiable {

    void sendAlert();
}

// Implementing Multiple Interfaces
class FitnessDevice implements Trackable, Reportable, Notifiable {

    @Override
    public void logActivity() {
        System.out.println("Activity Logged: 5000 Steps");
    }

    @Override
    public void generateReport() {
        System.out.println("Weekly Fitness Report Generated");
    }

    @Override
    public void sendAlert() {
        System.out.println("Alert: Time to Drink Water!");
    }
}

// Main Class
public class FitnessTracker {

    public static void main(String[] args) {

        FitnessDevice device = new FitnessDevice();

        device.logActivity();
        device.generateReport();
        device.sendAlert();
        device.resetData();
    }
}