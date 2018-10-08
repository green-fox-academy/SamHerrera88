public class Sponsor extends Person {
    String company;
    int hiredStudents;

    Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    Sponsor() {
        this.company = "Google";
        this.hiredStudents = 0;
    }

    void intro() {
        super.intro();
        System.out.println("who represent " + company + " and hired " + hiredStudents + " students so far.");
    }

    void hire() {
        hiredStudents++;
    }

    void getGoal() {
        System.out.println("My goal is: Hire brilliant junior software developers");
    }
}