import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger= new Passenger("Calum",2);}

    @Test
    public void hasName() {
        assertEquals("Calum", passenger.getName());
    }

    @Test
    public void hasBag(){
        assertEquals(2, passenger.getBagCount());
    }
}
