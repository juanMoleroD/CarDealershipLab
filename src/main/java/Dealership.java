import customers.Customer;
import vehicles.Truck;
import vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Dealership {

    private List<Vehicle> vehicles;
    private int till;

    public Dealership(int till) {
        this.vehicles = new ArrayList<>();
        this.till = till;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public int getTill() {
        return till;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void sellVehicle(Customer customer, int indexOfVehicle) {
        Vehicle vehicle = vehicles.get(indexOfVehicle);
        if (customer.getMoneyCount() >= vehicle.getPrice()) {
            customer.buyVehicle(vehicles.get(indexOfVehicle));
            vehicles.remove(indexOfVehicle);
        }
    }

    public void buyVehicle(Vehicle vehicle) {
        if (till >= vehicle.getPrice()) {
            addVehicle(vehicle);
            till -= vehicle.getPrice();
        }
    }

    public void repair(Vehicle vehicle) {
        this.till -= vehicle.getDamage();
        vehicle.clearDamage();
    }
}
