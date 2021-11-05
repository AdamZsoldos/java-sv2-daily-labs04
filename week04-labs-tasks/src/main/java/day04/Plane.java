package day04;

import java.util.ArrayList;
import java.util.List;

public class Plane {

    private final int passengerCapacity;
    private final List<Passenger> passengers = new ArrayList<>();

    public Plane(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public boolean addPassenger(Passenger passenger) {
        if (passengers.size() >= passengerCapacity) return false;
        passengers.add(passenger);
        return true;
    }

    public int getNumberOfPackages() {
        int result = 0;
        for (Passenger passenger : passengers) result += passenger.getNumberofPackages();
        return result;
    }
}
