package org.example;
import java.util.HashMap;
import java.util.Map;

public class DriverService {
    private Map<String, Driver> driverStore = new HashMap<>();

    // Initialize with some sample data
    public DriverService() {
        driverStore.put("driver123", new Driver("driver123", "John Doe", "available", 4.8));
        driverStore.put("driver456", new Driver("driver456", "Jane Smith", "busy", 4.5));
    }

    public Driver getDriver(String driverId) {
        return driverStore.get(driverId);
    }

    public Driver updateDriverStatus(String driverId, String status) {
        Driver driver = driverStore.get(driverId);
        if (driver != null) {
            driver.setStatus(status);
        }
        return driver;
    }
}