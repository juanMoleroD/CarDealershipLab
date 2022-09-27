package vehicles.parts;

public class Engine {

    private final String serialNumber;
    private String type;
    private FuelType fuelType;

    public Engine(String serialNumber, String type, FuelType fuelType) {
        this.serialNumber = serialNumber;
        this.type = type;
        this.fuelType = fuelType;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getType() {
        return type;
    }

    public FuelType getFuelType() {
        return fuelType;
    }
}
