package vehicles;

import vehicles.parts.Engine;
import vehicles.parts.Tyre;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {

    private final String make;
    private final String model;
    private Engine engine;
    private List<Tyre> tyres;
    private String colour;
    private int price;

    public Vehicle(String make, String model, int price) {
        this.make = make;
        this.model = model;
        this.tyres = new ArrayList<>();
        this.colour = "white";
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void paint(String colour) {
        this.colour = colour;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public List<Tyre> getTyres() {
        return tyres;
    }
    public void addTyre(Tyre tyre) {
        tyres.add(tyre);
    }

    public int getPrice() {
        return price;
    }
}
