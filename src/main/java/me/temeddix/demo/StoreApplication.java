package me.temeddix.demo;

import me.temeddix.demo.entities.Profile;
import me.temeddix.demo.entities.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

  public static void main(String[] args) {
//    var context = SpringApplication.run(StoreApplication.class, args);
    var user = User.builder().name("John").email("john@example.com")
        .password("password").build();
    var profile = Profile.builder().bio("about myself...").build();
    user.addProfile(profile);
    System.out.println(user);
  }
}
