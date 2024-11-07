package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
public class RideServices {
    public static Integer ride(Integer i){
        return i*i;
    }
    private Map<String, Ride> rideStore = new HashMap<>();

    public Ride createRide(String userId, String driverId, String pickupLocation, String dropoffLocation) {
        String rideId = UUID.randomUUID().toString();
        Ride ride = new Ride(rideId, userId, driverId, pickupLocation, dropoffLocation);
        rideStore.put(rideId, ride);
        return ride;
    }

    public Ride getRide(String rideId) {
        return rideStore.get(rideId);
    }

    public Ride updateRideStatus(String rideId, String status) {
        Ride ride = rideStore.get(rideId);
        if (ride != null) {
            ride.setStatus(status);
        }
        return ride;
    }
}

