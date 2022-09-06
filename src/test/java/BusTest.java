import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Person person;
    Bus bus;
    Bus bus2;
    BusStop busStop;

    @Before
    public void setUp(){
        person = new Person();
        bus = new Bus(10, "Ocean Terminal");
        bus2 = new Bus(0, "Restalrig");
        busStop = new BusStop("Bread Street");
        busStop.addToQueue(person);
    }

    @Test
    public void canFindNumberOfPassengers(){
        assertEquals(0, bus.numberOfPassengers());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.numberOfPassengers());
    }

    @Test
    public void cantAddPassenger(){
        assertEquals("Bus is full!", bus2.addPassenger(person));
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.numberOfPassengers());
    }

    @Test
    public void canAddFromStop(){
        bus.addFromStop(busStop);
        assertEquals(1, bus.numberOfPassengers());
    }

}
