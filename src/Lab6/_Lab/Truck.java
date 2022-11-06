package Lab6._Lab;

public class Truck extends Car{
    int wheels;
    int maxWeight;

    public int newWheels(int wheels) {
        this.wheels = wheels;
        return this.wheels;
    }

    public Truck(int weight, String model, char color, float speed, int wheels, int maxWeight) {
        this.weight = weight;
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.wheels = wheels;
        this.maxWeight = maxWeight;
    }
}
