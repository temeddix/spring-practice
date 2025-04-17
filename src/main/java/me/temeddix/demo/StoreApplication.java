package me.temeddix.demo;

import me.temeddix.demo.entities.User;
import me.temeddix.demo.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

  public static void main(String[] args) {
    var context = SpringApplication.run(StoreApplication.class, args);
    var repository = context.getBean(UserRepository.class);
    var user = User.builder().name("John").email("john@gmail.com")
        .password("password").build();
    repository.save(user);
  }
}
