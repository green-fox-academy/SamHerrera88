public class Flower extends healthyPlants {
    public Flower(String name) {
        super(name);
    }

    void watering(double amountOfWater) {
        super.waterLevel += 3 * amountOfWater / 4;
    }

    boolean needsWater() {
        if (waterLevel < 5) {
            return true;
        }
        return false;
    }
}
