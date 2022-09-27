import customers.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vehicles.Truck;

import static org.junit.jupiter.api.Assertions.*;

class DealershipTest {

    Dealership dealership;
    Truck truck;

    @BeforeEach
    void setUp() {
        dealership = new Dealership(100000);
        truck = new Truck("Ford", "F150", 30000, 0);
    }

    @Test
    void tillStartsAt10000() {
        assertEquals(100000, dealership.getTill());
    }

    @Test
    void canStoreVehicles() {
        assertEquals(0, dealership.getVehicles().size());
        dealership.addVehicle(truck);
        assertEquals(1, dealership.getVehicles().size());
    }

    @Test
    void canSellVehicle() {
        dealership.addVehicle(truck);
        Customer customer = new Customer(35000);
        assertEquals(0, customer.getVehiclesOwned().size());
        dealership.sellVehicle(customer, 0);
        assertEquals(0, dealership.getVehicles().size());
        assertEquals(1, customer.getVehiclesOwned().size());
    }

    @Test
    void canBuyVehicles() {
        dealership.buyVehicle(truck);
        assertEquals(1, dealership.getVehicles().size());
        assertEquals(70000, dealership.getTill());
    }

    @Test
    void canRepairVehicles() {
        truck.addDamage(5000);
        dealership.repair(truck);
        assertEquals(30000, truck.getGrossPrice());
        assertEquals(95000, dealership.getTill());
    }
}