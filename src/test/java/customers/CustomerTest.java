package customers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer customer = new Customer(1000);

    @Test
    void hasMoney() {
        assertEquals(1000, customer.getMoneyCount());
    }

    @Test
    void canOwnVehicles() {
        assertEquals(0, customer.getVehiclesOwned().size());
    }
}