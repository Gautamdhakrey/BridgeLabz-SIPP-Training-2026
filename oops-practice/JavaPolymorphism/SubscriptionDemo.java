class Subscription {

    String subscriberName;
    String subscriptionId;

    Subscription(String name, String id) {
        subscriberName = name;
        subscriptionId = id;
    }

    double calculateMonthlyCharge() {
        return 0;
    }

    void display() {
        System.out.println(subscriberName + " - " + subscriptionId);
    }
}

class BasicPlan extends Subscription {

    BasicPlan(String name, String id) {
        super(name, id);
    }

    double calculateMonthlyCharge() {
        return 199;
    }
}

class PremiumPlan extends Subscription {

    PremiumPlan(String name, String id) {
        super(name, id);
    }

    double calculateMonthlyCharge() {
        return 499;
    }
}

class FamilyPlan extends Subscription {

    FamilyPlan(String name, String id) {
        super(name, id);
    }

    double calculateMonthlyCharge() {
        return 799;
    }
}

public class SubscriptionDemo {

    static void search(Subscription arr[], String id) {

        for (Subscription s : arr)

            if (s.subscriptionId.equals(id))
                s.display();
    }

    static void displayByLetter(Subscription arr[], char ch) {

        for (Subscription s : arr)

            if (s.subscriberName.startsWith("" + ch))
                s.display();
    }

    static void totalRevenue(Subscription arr[]) {

        double total = 0;

        for (Subscription s : arr)
            total += s.calculateMonthlyCharge();

        System.out.println("Revenue = ₹" + total);
    }

    public static void main(String args[]) {

        Subscription list[] = {
                new BasicPlan("Aman", "S1"),
                new PremiumPlan("Rahul", "S2"),
                new FamilyPlan("Ankit", "S3")
        };

        search(list, "S2");

        System.out.println();

        displayByLetter(list, 'A');

        System.out.println();

        totalRevenue(list);

        Subscription max = list[0];

        for (Subscription s : list)

            if (s.calculateMonthlyCharge() >
                    max.calculateMonthlyCharge())

                max = s;

        System.out.println("\nMost Expensive Plan");

        max.display();
    }
}