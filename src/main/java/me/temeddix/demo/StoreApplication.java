package me.temeddix.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {
    public static void main(String[] args) {
        var context = SpringApplication.run(StoreApplication.class, args);
        var userService = context.getBean(UserService.class);
        var user = new User(0, "cuteonion@gmail.com", "police0112", "Milla");
        userService.registerUser(user);
        var sameUser = new User(0, "cuteonion@gmail.com", "police0112", "Milla");
        userService.registerUser(sameUser);
    }
}
