package customers;

import vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private int money;
    private List<Vehicle> vehicles;

    public Customer(int money) {
        this.money = money;
        this.vehicles = new ArrayList<>();
    }

    public int getMoneyCount() {
        return money;
    }

    public List<Vehicle> getVehiclesOwned() {
        return vehicles;
    }

    public void buyVehicle(Vehicle vehicle) {
        if (money >= vehicle.getPrice()) {
            vehicles.add(vehicle);
            money -= vehicle.getPrice();
        }
    }
}
