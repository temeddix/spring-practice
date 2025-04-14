package me.temeddix.demo;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class InMemoryUserRepository implements UserRepository {
    private final HashMap<String, User> users;

    public InMemoryUserRepository() {
        users = new HashMap<>();
    }

    @Override
    public boolean save(User user) {
        if (users.containsKey(user.email)) {
            System.out.println("Already exists: " + users.get(user.email));
            return false;
        }
        users.put(user.email, user);
        System.out.println("Added: " + users.get(user.email));
        return true;
    }
}
