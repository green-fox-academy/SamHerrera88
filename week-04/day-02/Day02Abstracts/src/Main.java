public class Main {
    public static void main(String[] args) {

        CStudent john = new CStudent("John Clone", 20, "male", "BME", 0);
        CStudent johnClone = john.clone();
        johnClone.intro();
    }
}