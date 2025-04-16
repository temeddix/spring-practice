package me.temeddix.demo;

import me.temeddix.demo.entities.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

  public static void main(String[] args) {
//    var context = SpringApplication.run(StoreApplication.class, args);
    var user = User.builder().name("John").email("john@example.com")
        .password("password").build();

    user.addTag("tag_one");
    System.out.println(user);
  }
}
