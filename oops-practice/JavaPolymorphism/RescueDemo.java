class RescueTeam {

    String teamId;
    String location;

    RescueTeam(String id, String location) {
        teamId = id;
        this.location = location;
    }

    void performDuty() {
        System.out.println("Performing Rescue");
    }
}

class MedicalTeam extends RescueTeam {

    MedicalTeam(String id, String loc) {
        super(id, loc);
    }

    void performDuty() {
        System.out.println(teamId +
                " Providing Medical Aid");
    }
}

class FireRescueTeam extends RescueTeam {

    FireRescueTeam(String id, String loc) {
        super(id, loc);
    }

    void performDuty() {
        System.out.println(teamId +
                " Extinguishing Fire");
    }
}

class FoodSupplyTeam extends RescueTeam {

    FoodSupplyTeam(String id, String loc) {
        super(id, loc);
    }

    void performDuty() {
        System.out.println(teamId +
                " Distributing Food");
    }
}

public class RescueDemo {

    static void findTeamByLocation(
            RescueTeam teams[],
            String location) {

        for (RescueTeam t : teams)

            if (t.location.equalsIgnoreCase(location))
                t.performDuty();
    }

    static void displayTeamsByPrefix(
            RescueTeam teams[],
            String prefix) {

        for (RescueTeam t : teams)

            if (t.teamId.startsWith(prefix))
                System.out.println(t.teamId);
    }

    public static void main(String args[]) {

        RescueTeam teams[] = {
                new MedicalTeam("M101", "Delhi"),
                new FireRescueTeam("F201", "Delhi"),
                new FoodSupplyTeam("FS301", "Agra"),
                new MedicalTeam("M102", "Agra"),
                new MedicalTeam("M103", "Delhi")
        };

        int medical = 0,
                fire = 0,
                food = 0;

        for (RescueTeam t : teams) {

            t.performDuty();

            if (t instanceof MedicalTeam)
                medical++;

            else if (t instanceof FireRescueTeam)
                fire++;

            else if (t instanceof FoodSupplyTeam)
                food++;
        }

        System.out.println();

        findTeamByLocation(teams, "Delhi");

        System.out.println();

        displayTeamsByPrefix(teams, "M");

        System.out.println();

        System.out.println("Medical : " + medical);
        System.out.println("Fire : " + fire);
        System.out.println("Food : " + food);

        if (medical >= fire && medical >= food)
            System.out.println("Maximum Deployment : Medical Team");

        else if (fire >= medical && fire >= food)
            System.out.println("Maximum Deployment : Fire Rescue Team");

        else
            System.out.println("Maximum Deployment : Food Supply Team");
    }
}