import java.util.HashSet;

public class EventEntry {

    static HashSet<String> participants = new HashSet<>();

    public static void register(String email) {

        if (participants.add(email))
            System.out.println("Registration Successful");
        else
            System.out.println("Duplicate Registration Rejected");
    }

    public static void display() {

        System.out.println("\nRegistered Participants:");

        for (String s : participants)
            System.out.println(s);

        System.out.println("Total Participants = " + participants.size());
    }

    public static void main(String[] args) {

        register("amit@gmail.com");
        register("rahul@gmail.com");
        register("amit@gmail.com");
        register("neha@gmail.com");

        display();
    }
}