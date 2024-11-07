package org.example;

public class Driver {
    private String driverId;
    private String name;
    private String status;
    private Double rating;

    public Driver(String driverId, String name, String status, Double rating) {
        this.driverId = driverId;
        this.name = name;
        this.status = status;
        this.rating = rating;
    }
    public void setStatus(String status){
        this.status = status;
    }
}