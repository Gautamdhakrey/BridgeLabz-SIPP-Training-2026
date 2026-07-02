import java.util.*;

// Abstract Class
abstract class JobRole {
    String name;

    JobRole(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

// Child Classes
class SoftwareEngineer extends JobRole {
    SoftwareEngineer(String name) {
        super(name);
    }
}

class DataScientist extends JobRole {
    DataScientist(String name) {
        super(name);
    }
}

class ProductManager extends JobRole {
    ProductManager(String name) {
        super(name);
    }
}

// Generic Class
class Resume<T extends JobRole> {

    private T role;

    Resume(T role) {
        this.role = role;
    }

    public T getRole() {
        return role;
    }

    public void processResume() {
        System.out.println("Processing Resume for : " + role);
    }
}

// Generic Method + Wildcard Method
class ResumeUtility {

    // Generic Method
    public static <T extends JobRole> void verifyRole(T role) {
        System.out.println("Verified Role : " + role);
    }

    // Wildcard Method
    public static void screeningPipeline(List<? extends JobRole> roles) {
        System.out.println("\nScreening Pipeline:");
        for (JobRole role : roles) {
            System.out.println(role);
        }
    }
}

// Driver Class
public class ResumeDemo {

    public static void main(String[] args) {

        Resume<SoftwareEngineer> se =
                new Resume<>(new SoftwareEngineer("Software Engineer"));

        Resume<DataScientist> ds =
                new Resume<>(new DataScientist("Data Scientist"));

        Resume<ProductManager> pm =
                new Resume<>(new ProductManager("Product Manager"));

        se.processResume();
        ds.processResume();
        pm.processResume();

        ResumeUtility.verifyRole(se.getRole());
        ResumeUtility.verifyRole(ds.getRole());
        ResumeUtility.verifyRole(pm.getRole());

        List<JobRole> roles = new ArrayList<>();
        roles.add(new SoftwareEngineer("Software Engineer"));
        roles.add(new DataScientist("Data Scientist"));
        roles.add(new ProductManager("Product Manager"));

        ResumeUtility.screeningPipeline(roles);
    }
}