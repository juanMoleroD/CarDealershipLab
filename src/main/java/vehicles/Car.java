package vehicles;


import vehicles.parts.ChasisType;

public class Car extends Vehicle {

    public Car(String make, String model, int price, int damage) {
        super(make, model, price, damage);
        this.chasisType = ChasisType.CAR;
    }
}
