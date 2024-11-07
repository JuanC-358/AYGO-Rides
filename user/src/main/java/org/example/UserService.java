package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
public class UserService {
    private Map<String, User> userStore = new HashMap<>();

    public User createUser(String name, String email) {
        String userId = UUID.randomUUID().toString();
        User user = new User(userId, name, email);
        userStore.put(userId, user);
        return user;
    }

    public User getUser(String userId) {
        return userStore.get(userId);
    }
}