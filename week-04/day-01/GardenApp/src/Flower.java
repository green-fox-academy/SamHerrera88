public class Flower extends healthyPlants {
    Flower(String color, double waterLevel){
    this.color = color;
    this.waterLevel = waterLevel;
    this.waterThreshold = 5;
    this.absorption() = 0.75;
    this.type = "flower";
    }
}