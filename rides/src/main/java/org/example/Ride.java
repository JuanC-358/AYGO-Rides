package org.example;

public class Ride {
    private String rideId;
    private String userId;
    private String driverId;
    private String pickupLocation;
    private String dropoffLocation;
    private String status;

    public Ride(String rideId, String userId, String driverId, String pickupLocation, String dropoffLocation) {
        this.rideId = rideId;
        this.userId = userId;
        this.driverId = driverId;
        this.pickupLocation = pickupLocation;
        this.dropoffLocation = dropoffLocation;
        this.status = "requested";
    }
    public void setStatus(String status){
        this.status = status;
    }

}