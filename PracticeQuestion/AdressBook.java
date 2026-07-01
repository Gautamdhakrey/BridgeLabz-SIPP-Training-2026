import java.util.*;

class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

public class AdressBook {
    static ArrayList<Contact> contacts = new ArrayList<>();
    static HashMap<String, Contact> nameMap = new HashMap<>();
    static HashSet<String> phoneSet = new HashSet<>();

    public static void addContact(String name, String phone, String email) {
        if (phoneSet.contains(phone)) {
            System.out.println("Duplicate phone number not allowed.");
            return;
        }

        Contact c = new Contact(name, phone, email);
        contacts.add(c);
        nameMap.put(name, c);
        phoneSet.add(phone);

        System.out.println("Contact Added Successfully.");
    }

    public static void search(String name) {
        Contact c = nameMap.get(name);

        if (c != null) {
            System.out.println(c.name + " " + c.phone + " " + c.email);
        } else {
            System.out.println("Contact Not Found");
        }
    }

    public static void delete(String name) {
        Contact c = nameMap.remove(name);

        if (c != null) {
            contacts.remove(c);
            phoneSet.remove(c.phone);
            System.out.println("Deleted Successfully");
        } else {
            System.out.println("Contact Not Found");
        }
    }

    public static void display() {

        Collections.sort(contacts, (a, b) -> a.name.compareToIgnoreCase(b.name));

        System.out.println("\nContacts:");

        for (Contact c : contacts) {
            System.out.println(c.name + " " + c.phone + " " + c.email);
        }
    }

    public static void main(String[] args) {

        addContact("Amit", "999111", "amit@gmail.com");
        addContact("Rahul", "999222", "rahul@gmail.com");
        addContact("Neha", "999333", "neha@gmail.com");

        search("Rahul");

        delete("Amit");

        display();
    }
}