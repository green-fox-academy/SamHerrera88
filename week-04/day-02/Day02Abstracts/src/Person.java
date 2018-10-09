public class Person {
    String name;
    int age;
    String gender;

    Person(String name, int age, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    Person() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }

    void intro() {
        System.out.println("Hello, I'm " + name + ", a " + age + " years old " + gender);
    }

    void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }
}
