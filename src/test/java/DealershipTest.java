import org.junit.jupiter.api.Test;
import vehicles.Truck;

import static org.junit.jupiter.api.Assertions.*;

class DealershipTest {
    Dealership dealership = new Dealership();

    @Test
    void tillStartsAt10000() {
        assertEquals(10000, dealership.getTill());
    }

    @Test
    void canStoreVehicles() {
        assertEquals(0, dealership.getVehicles().size());
        Truck truck = new Truck("Ford", "F150", 30000);
        dealership.addVehicle(truck);
        assertEquals(1, dealership.getVehicles().size());
    }

}