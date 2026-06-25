// Parent Class
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // toString()
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

// Child Class
class Student extends Person {

    final int studentId;   // final variable
    double gpa;

    // Constructor using super()
    Student(String name, int age, int studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    // Override toString()
    @Override
    public String toString() {
        return super.toString()
                + ", Student ID: " + studentId
                + ", GPA: " + gpa;
    }
}

// Grandchild Class
class GradStudent extends Student {

    String thesis;

    // Constructor using super()
    GradStudent(String name, int age, int studentId, double gpa, String thesis) {
        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }

    // Override toString()
    @Override
    public String toString() {
        return super.toString()
                + ", Thesis: " + thesis;
    }
}

// Main Class
public class UniversitySystem {

    public static void main(String[] args) {

        GradStudent gs = new GradStudent(
                "Gautam",
                22,
                101,
                9.2,
                "Artificial Intelligence"
        );

        // Display object
        System.out.println(gs);

        // IS-A Relationship
        Person p = gs;
        Student s = gs;

        System.out.println("\nIS-A Relationship Demonstration");
        System.out.println("GradStudent IS-A Student : " + (gs instanceof Student));
        System.out.println("GradStudent IS-A Person  : " + (gs instanceof Person));
        System.out.println("Student IS-A Person      : " + (s instanceof Person));
    }
}