package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
public class PaymentService {
    private Map<String, Payment> paymentStore = new HashMap<>();

    public Payment processPayment(String rideId, double amount) {
        String paymentId = UUID.randomUUID().toString();
        Payment payment = new Payment(paymentId, rideId, amount);
        payment.setStatus("completed"); // Assuming payment completes successfully
        paymentStore.put(rideId, payment);
        return payment;
    }

    public Payment getPaymentDetails(String rideId) {
        return paymentStore.get(rideId);
    }
}