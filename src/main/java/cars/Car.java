package cars;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Car {
    private final String make;
    private final String model;
    private Engine engine;
    private List<Tyre> tyres;

    public Car(String make, String model, Engine engine) {
        this.make = make;
        this.model = model;
        this.engine = engine;
        this.tyres = new ArrayList<>();
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
}
