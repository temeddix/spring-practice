package me.temeddix.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService implements NotificationService {
    @Value("${mailServer.port:9000}")
    private int mailServerPort;

    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("Email sent to " + recipientEmail + " (port " + mailServerPort + "): " + message);
    }
}
