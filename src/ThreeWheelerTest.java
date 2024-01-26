import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeWheelerTest {

    @Test
    void testThreeWheelerName() {
        ThreeWheeler t3 = new ThreeWheeler("Stiga x3");
        assertEquals("Stiga x3", t3.name());
    }

    @Test
    void testThreeWheelerPlinga() {
        ThreeWheeler t3 = new ThreeWheeler("Stiga x3");
        String expected = "Meep..meep..";
        String actual = t3.plinga();
        assertEquals(expected, actual);
    }
}
