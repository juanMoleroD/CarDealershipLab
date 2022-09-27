import vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Dealership {

    private List<Vehicle> vehicles;
    private int till;

    public Dealership() {
        this.vehicles = new ArrayList<>();
        this.till = 10000;
    }
}
