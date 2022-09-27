package customers;

import org.junit.jupiter.api.Test;
import vehicles.Car;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer customer = new Customer(10001);

    @Test
    void hasMoney() {
        assertEquals(10001, customer.getMoneyCount());
    }

    @Test
    void canOwnVehicles() {
        assertEquals(0, customer.getVehiclesOwned().size());
    }

    @Test
    void canBuyVehicle_IfEnoughMoney() {
        Car car = new Car("BMW", "M1", 10000, 0);
        customer.buyVehicle(car);
        assertEquals(1, customer.getVehiclesOwned().size());
        assertEquals(1, customer.getMoneyCount());
    }

    @Test
    void cantBuyIfNoMoney() {
        Car car = new Car("BMW", "M3", 20000, 0);
        customer.buyVehicle(car);
        assertEquals(0, customer.getVehiclesOwned().size());
        assertEquals(10001, customer.getMoneyCount());
    }
}