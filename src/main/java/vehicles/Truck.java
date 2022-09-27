package vehicles;

import vehicles.parts.ChasisType;

public class Truck extends Vehicle {
    public Truck(String make, String model, int price, int damage) {
        super(make, model, price, damage);
        this.chasisType = ChasisType.TRUCK;
    }

}
