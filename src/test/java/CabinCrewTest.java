import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){

        cabinCrewMember= new CabinCrewMember("Tony", CabinCrewType.CAPTAIN );
        cabinCrewMember= new CabinCrewMember("Lewis", CabinCrewType.FIRSTOFFICER);
        cabinCrewMember= new CabinCrewMember("Will", CabinCrewType.PURSER);
        cabinCrewMember= new CabinCrewMember("John",CabinCrewType.FLIGHTATTENDANT);
    }

    @Test
    public void hasRank(){
        assertEquals("Captain", CabinCrewType.CAPTAIN.getRank());
    }
}
