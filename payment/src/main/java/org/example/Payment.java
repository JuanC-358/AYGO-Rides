package org.example;
import java.time.LocalDateTime;
public class Payment {
    private String paymentId;
    private String rideId;
    private double amount;
    private String status;
    private LocalDateTime timestamp;

    // Constructors, getters, and setters
    public Payment(String paymentId, String rideId, double amount) {
        this.paymentId = paymentId;
        this.rideId = rideId;
        this.amount = amount;
        this.status = "pending"; // Default status
        this.timestamp = LocalDateTime.now();
    }

    public String getPaymentId() { return paymentId; }
    public String getRideId() { return rideId; }
    public double getAmount() { return amount; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public LocalDateTime getTimestamp() { return timestamp; }
}