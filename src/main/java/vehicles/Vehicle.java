package vehicles;

import vehicles.parts.ChasisType;
import vehicles.parts.Engine;
import vehicles.parts.Tyre;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

    private final String make;
    private final String model;
    private Engine engine;
    private List<Tyre> tyres;
    private String colour;
    private int price;
    private int damage;
    protected  ChasisType chasisType;

    public Vehicle(String make, String model, int price, int damage) {
        this.make = make;
        this.model = model;
        this.tyres = new ArrayList<>();
        this.colour = "white";
        this.price = price;
        this.damage = damage;
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
    public int getGrossPrice() {
        return price - damage;
    }

    public int getDamage() {
        return damage;
    }

    public void addDamage(int damageValue) {
        this.damage += damageValue;
    }

    public void clearDamage(){
        this.damage = 0;
    }

    public ChasisType getChasisType() {
        return chasisType;
    }
}
