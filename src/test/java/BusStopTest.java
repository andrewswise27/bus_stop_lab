import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    Person person;
    Bus bus;
    BusStop busStop;

    @Before
    public void setUp(){
        person = new Person();
        bus = new Bus(10, "Silverknowes");
        busStop = new BusStop("Princes JK");
    }

    @Test
    public void canAddToQueue(){
        busStop.addToQueue(person);
        assertEquals(1, busStop.lengthOfQueue());
    }

    @Test
    public void canRemoveToQueue(){
        busStop.addToQueue(person);
        busStop.removeFromQueue();
        assertEquals(0, busStop.lengthOfQueue());
    }

}
