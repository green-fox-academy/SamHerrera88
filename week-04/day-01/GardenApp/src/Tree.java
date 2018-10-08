public class Tree extends healthyPlants {
    public Tree(String name) {
        super(name);
    }
    void watering (double amountOfWater) {
        super.waterLevel+=4*amountOfWater/10;
    }

    boolean needsWater () {
        if (super.waterLevel < 10) {
            return true;
        } else {
            return false;
        }
    }
}