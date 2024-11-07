package org.example;

import java.time.LocalDateTime;

public class User {
    private String userId;
    private String name;
    private String email;
    private LocalDateTime registrationDate;

    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.registrationDate = LocalDateTime.now();
    }

    public String getUserId() { return userId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public LocalDateTime getRegistrationDate() { return registrationDate; }

}