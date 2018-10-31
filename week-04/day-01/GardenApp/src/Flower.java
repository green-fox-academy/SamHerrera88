public class Flower extends healthyPlants {
    public Flower(String name) {
        super(name);
    }

    void watering(double amountOfWater) {
        super.waterLevel += amountOfWater * 0.75;
    }

    boolean needsWater() {
        if (waterLevel < 5) {
            return true;
        }
        return false;
    }
}