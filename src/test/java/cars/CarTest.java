package cars;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Engine engine = new Engine("123456", "V6", FuelType.GASOLINE);
    Car car = new Car("Toyota", "Corola", engine);

    @Test
    void hasMakeAndModel() {
        assertEquals("Toyota", car.getMake());
        assertEquals("Corola", car.getModel());
    }

    @Test
    void hasFuelType() {
        assertEquals(FuelType.GASOLINE, car.getEngine().getFuelType());
    }

    @Test
    void hasTyres() {
        Tyre tyre = new Tyre("Prielli", "200/100/18R");
        for(int i = 0; i < 4; i++) car.addTyre(tyre);
        assertEquals(4, car.getTyres().size());
    }

    @Test
    void hasColour() {

//        car.getColour()
    }
}