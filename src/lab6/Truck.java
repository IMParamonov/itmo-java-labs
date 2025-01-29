package lab6;

public class Truck extends Car{
    int wheelsNumber;
    int maxWeight;

    public Truck() {
    }

    public Truck (int weight, String model, char color, float speed, int wheelsNumber, int maxWeight) {
        super(weight, model, color, speed);
        this.wheelsNumber = wheelsNumber;
        this.maxWeight = maxWeight;
    }

    public void newWheel(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
        System.out.println("Количество колес: " + wheelsNumber);
    }

}
