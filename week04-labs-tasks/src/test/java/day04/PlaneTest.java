package day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaneTest {

    Plane plane;
    Passenger passenger;

    @BeforeEach
    void setUp() {
        plane = new Plane(10);
        passenger = new Passenger("John Doe", "999999", 3);
    }

    @Test
    void testAddPassenger() {
        for (int i = 0; i < plane.getPassengerCapacity() - 1; i++) {
            plane.addPassenger(passenger);
        }
        assertTrue(plane.addPassenger(passenger));
        assertFalse(plane.addPassenger(passenger));
        assertEquals(plane.getPassengerCapacity(), plane.getPassengers().size());
    }

    @Test
    void testGetNumberOfPackages() {
        for (int i = 0; i < plane.getPassengerCapacity() - 1; i++) {
            plane.addPassenger(passenger);
        }
        assertEquals(plane.getPassengers().size() * passenger.getNumberofPackages(), plane.getNumberOfPackages());
    }
}