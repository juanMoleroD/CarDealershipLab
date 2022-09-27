package vehicles.parts;

public class Tyre {

    private final String make;
    private final String model;

    public Tyre(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
