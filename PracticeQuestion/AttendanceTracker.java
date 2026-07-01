import java.util.*;

public class AttendanceTracker {

    static HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    public static void markAttendance(String subject, String student) {

        attendance.putIfAbsent(subject, new ArrayList<>());

        ArrayList<String> students = attendance.get(subject);

        if (!students.contains(student)) {
            students.add(student);
            System.out.println(student + " marked present in " + subject);
        } else {
            System.out.println("Duplicate Attendance Not Allowed");
        }
    }

    public static void display() {

        System.out.println();

        for (String subject : attendance.keySet()) {

            ArrayList<String> students = attendance.get(subject);

            System.out.println("Subject : " + subject);

            for (String s : students)
                System.out.println(s);

            System.out.println("Total Students = " + students.size());

            System.out.println();
        }
    }

    public static void main(String[] args) {

        markAttendance("Java", "Amit");
        markAttendance("Java", "Rahul");
        markAttendance("Java", "Amit");

        markAttendance("DBMS", "Neha");
        markAttendance("DBMS", "Rahul");

        display();
    }
}