import java.util.*;

class Employee {

    int id;
    int attendance;

    Employee(int id, int attendance) {
        this.id = id;
        this.attendance = attendance;
    }
}

public class AttendanceRanking {

    public static int[] topKEmployees(int[] ids, int[] attendance, int k) {

        Employee[] employees = new Employee[ids.length];

        for (int i = 0; i < ids.length; i++) {
            employees[i] = new Employee(ids[i], attendance[i]);
        }

        Arrays.sort(employees, (a, b) -> {

            if (a.attendance != b.attendance)
                return b.attendance - a.attendance;

            return a.id - b.id;
        });

        int[] ans = new int[k];

        for (int i = 0; i < k; i++)
            ans[i] = employees[i].id;

        return ans;
    }

    public static void main(String[] args) {

        int[] ids = {101,102,103,104,105};

        int[] attendance = {92,85,98,92,80};

        int k = 3;

        System.out.println(Arrays.toString(topKEmployees(ids, attendance, k)));
    }
}