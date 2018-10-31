public class healthyPlants {
    protected int waterLevel;
    protected String name;

    healthyPlants(String name) {
        waterLevel = 0;
        this.name = name;
    }

    void watering(double amountOfWater) {
    }

    boolean needsWater() {
        return false;
    }
}