package homework_3.seminar_examples.OCP;

public class Car extends Vehicle {

    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);

    }

    @Override
    public double calculateAllowedSpeed() {
        return super.maxSpeed * 0.8;
    }
    
}
