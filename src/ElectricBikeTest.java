import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ElectricBikeTest {

    @Test
    void testElectricBikeName() {
        ElectricBike eb = new ElectricBike("Super Duper");
        assertEquals("Electric Bike", eb.name());
    }

    @Test
    void testPlinga() {
        ElectricBike bike = new ElectricBike("E-Bike Model X");
        String expected = "pling...pling...";
        String actual = bike.plinga();
        assertEquals(expected, actual);
    }

    @Test
    void testBromsa() {
        ElectricBike bike = new ElectricBike("E-Bike Model X");
        assertTrue(bike.isMoving());
        bike.bromsa();
        assertFalse(bike.isMoving());
    }

    @Test
    void testSlangbyta() {
        ElectricBike bike = new ElectricBike("E-Bike Model X");
        assertNull(bike.getFlatTireStatus()); // Inget däckbyte ännu, så status ska vara null.
        bike.slangbyta();
        assertNotNull(bike.getFlatTireStatus()); // Efter däckbyte ska status inte längre vara null.
    }
}
