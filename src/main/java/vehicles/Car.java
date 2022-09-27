package vehicles;

import vehicles.parts.Engine;
import vehicles.parts.Tyre;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private final String make;
    private final String model;
    private Engine engine;
    private List<Tyre> tyres;
    private String colour;
    private int price;

    public Car(String make, String model, Engine engine, int price) {
        this.make = make;
        this.model = model;
        this.engine = engine;
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

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
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
