package me.temeddix.demo;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final NotificationService notificationService;

    public UserService(UserRepository userRepository, NotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }

    public void registerUser(User user) {
        var did_succeed = userRepository.save(user);
        if (did_succeed) {
            notificationService.send("User added", user.email);
        } else {
            notificationService.send("User already exists", user.email);
        }
    }
}
