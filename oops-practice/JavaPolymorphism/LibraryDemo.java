class LibraryMember {

    String memberName;
    String memberId;

    LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    double calculateFine(int overdueDays) {
        return 0;
    }

    void displayDetails() {
        System.out.println(memberName + " (" + memberId + ")");
    }
}

class StudentMember extends LibraryMember {

    StudentMember(String name, String id) {
        super(name, id);
    }

    @Override
    double calculateFine(int days) {
        return days * 2;
    }
}

class FacultyMember extends LibraryMember {

    FacultyMember(String name, String id) {
        super(name, id);
    }

    @Override
    double calculateFine(int days) {
        return days * 1;
    }
}

class GuestMember extends LibraryMember {

    GuestMember(String name, String id) {
        super(name, id);
    }

    @Override
    double calculateFine(int days) {
        return days * 5;
    }
}

public class LibraryDemo {

    public static void main(String[] args) {

        LibraryMember members[] = {
                new StudentMember("Rahul", "S101"),
                new FacultyMember("Dr. Sharma", "F201"),
                new GuestMember("Amit", "G301")
        };

        String searchId = "F201";

        for (LibraryMember m : members) {

            m.displayDetails();

            System.out.println("Fine = ₹"
                    + m.calculateFine(5));

            if (m.memberId.equals(searchId))
                System.out.println("Member Found!");

            System.out.println();
        }
    }
}