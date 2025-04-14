package me.temeddix.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {
    public static void main(String[] args) {
        var context = SpringApplication.run(StoreApplication.class, args);
        context.getBean(NotificationManager.class).sendNotification("HI");
    }
}
