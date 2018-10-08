public class Student extends Person {
    private String previousOrganiztion;
    private int skippedDays;

    Student(String name, int age, String gender, String previousOrganiztion) {
        super(name, age, gender);
        this.previousOrganiztion = previousOrganiztion;
        this.skippedDays = 0;
    }

    Student() {
        this.previousOrganiztion = "The School of Life.";
        this.skippedDays = 0;
    }

    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer.");
    }

    public void intro() {
        super.intro();
        System.out.println("Hello, I'm " + name + ", a " + age + " years old " + gender + " from " + previousOrganiztion + " who skipped " + skippedDays + " day from the course already.");
    }

    public void skipDays(int numOfDays) {
        skippedDays += numOfDays;
    }
}