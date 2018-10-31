public class Tree extends healthyPlants {
    public Tree(String name) {
        super(name);
    }
    void watering (double amountOfWater) {
        super.waterLevel += amountOfWater * 0.4;
    }

    boolean needsWater () {
        if (super.waterLevel < 10 ? true : false);
        return false;
    }
    }