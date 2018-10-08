public class Main {
    public static void main(String[] args) {
        TheGarden garden = new TheGarden();
        garden.addPlants(new Flower("yellow"));
        garden.addPlants(new Flower("blue"));
        garden.addPlants(new Tree("purple"));
        garden.addPlants(new Tree("orange"));
        garden.printInfo();
        garden.waterPlants(40);
        garden.printInfo();
        garden.waterPlants(70);
        garden.printInfo();
    }
}