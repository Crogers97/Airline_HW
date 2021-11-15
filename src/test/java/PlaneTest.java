import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.B737);
    }


    @Test
    public void planeHasModelType(){
        assertEquals("737", PlaneType.B737.getModelType());
    }

    @Test
    public void planeHasSeats(){
        assertEquals(100, PlaneType.B737.getNumberOfSeats());
    }
}
