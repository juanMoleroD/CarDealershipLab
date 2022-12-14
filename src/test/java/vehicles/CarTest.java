package vehicles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vehicles.parts.ChasisType;
import vehicles.parts.Engine;
import vehicles.parts.FuelType;
import vehicles.parts.Tyre;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

        Engine engine;
        Tyre tyre;
        Car car;

    @BeforeEach
    void setUp() {
        engine = new Engine("123456", "V6", FuelType.GASOLINE);
        tyre = new Tyre("Prielli", "200/100/18R");
        car = new Car("Toyota", "Corola", 20000, 0);
    }

    @Test
    void hasMakeAndModel() {
        assertEquals("Toyota", car.getMake());
        assertEquals("Corola", car.getModel());
    }

    @Test
    void hasFuelType() {
        car.setEngine(engine);
        assertEquals(FuelType.GASOLINE, car.getEngine().getFuelType());
    }

    @Test
    void hasTyres() {

        for (int i = 0; i < 4; i++) car.addTyre(tyre);
        assertEquals(4, car.getTyres().size());
    }

    @Test
    void hasColourStartsWhite() {
        assertEquals("white", car.getColour());
    }

    @Test
    void canChangeColour() {
        car.paint("red");
        assertEquals("red", car.getColour());
    }

    @Test
    void hasPrice() {
        assertEquals(20000, car.getPrice());
    }

    @Test
    void hasChasisType() {
        assertEquals(ChasisType.CAR, car.getChasisType());
    }

    @Test
    void canHaveDamage() {
        car.addDamage(1500);
        assertEquals(18500, car.getGrossPrice());
        assertEquals(1500, car.getDamage());
    }

    @Test
    void canClearDamage(){
        car.addDamage(1500);
        car.clearDamage();
        assertEquals(0, car.getDamage());
    }
}