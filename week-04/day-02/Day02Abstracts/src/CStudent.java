public class CStudent extends Person implements Cloneable {
    private String previousOrganiztion;
    private int skippedDays;

    CStudent(String name, int age, String gender, String previousOrganiztion) {
        super(name, age, gender);
        this.previousOrganiztion = "The School of Life";
        this.skippedDays = 0;
    }

    CStudent(String name, int age, String gender, String previousOrganiztion, int skippedDays) {
        super();
        this.previousOrganiztion = "The School of Life";
        this.skippedDays = 0;
    }

    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer.");
    }

    public void intro() {
        System.out.println("Hello, I'm " + name + ", a " + age + " years old " + gender + " from " + previousOrganiztion + ", who skipped " + skippedDays + " days from the course already.");
    }

    public void skipDays(int numOfDays) {
        skippedDays += numOfDays;
    }

    public CStudent clone() {
        CStudent john = new CStudent(this.name, this.age, this.gender, this.previousOrganiztion, this.skippedDays);
        return john;
    }
}