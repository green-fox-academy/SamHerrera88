public class healthyPlants {
    String color;
    double waterLevel;
    int waterThreshold;
    double absorption;
    String type;

    void water(int amount) {
        this.waterLevel += amount * absorption;
    }
}
