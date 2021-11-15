import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot= new Pilot("Colin","Co-Pilot","264739");

    }

    @Test
    public void hasPLNumber(){
        assertEquals("264739", pilot.getPLNumber());
    }
}
