import java.util.ArrayList;

public class Bus {

    private ArrayList<Person> passengers;
    private int capacity;
    private String destination;

    public Bus(int capacity, String destination){
        this.capacity = capacity;
        this.destination = destination;
        this.passengers = new ArrayList<Person>();
    }

    public int numberOfPassengers(){
        return this.passengers.size();
    }

    public String addPassenger(Person person){
        if( numberOfPassengers() < capacity){
            this.passengers.add(person);
            return "Passenger boarded";
        }
        else return "Bus is full!";
    }

    public void removePassenger(){
        this.passengers.remove(0);
    }

    public void addFromStop(BusStop busStop){
        Person person = busStop.removeFromQueue();
        passengers.add(person);
    }
}
