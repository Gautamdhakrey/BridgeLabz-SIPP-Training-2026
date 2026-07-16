class Notification {

    String recipientName;
    String message;

    Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    void sendNotification() {
        System.out.println("Notification Sent");
    }
}

class EmailNotification extends Notification {

    EmailNotification(String name, String msg) {
        super(name, msg);
    }

    @Override
    void sendNotification() {
        System.out.println("Email sent to " + recipientName +
                " : " + message);
    }
}

class SMSNotification extends Notification {

    SMSNotification(String name, String msg) {
        super(name, msg);
    }

    @Override
    void sendNotification() {
        System.out.println("SMS sent to " + recipientName +
                " : " + message);
    }
}

class PushNotification extends Notification {

    PushNotification(String name, String msg) {
        super(name, msg);
    }

    @Override
    void sendNotification() {
        System.out.println("Push Notification to " + recipientName +
                " : " + message);
    }
}

public class NotificationDemo {

    public static void main(String[] args) {

        Notification list[] = {
                new EmailNotification("Rahul", "Welcome"),
                new SMSNotification("Aman", "OTP 1234"),
                new PushNotification("Priya", "Sale Started")
        };

        for (Notification n : list)
            n.sendNotification();
    }
}