public class Tree extends healthyPlants {
    Tree(String color, double waterLevel) {
        this.color = color;
        this.waterLevel = waterLevel;
        this.waterThreshold = 10;
        this.absorption() = 0.4;
        this.type = "tree";
    }
}