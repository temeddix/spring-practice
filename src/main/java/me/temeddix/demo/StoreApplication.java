package me.temeddix.demo;

import me.temeddix.demo.entities.Address;
import me.temeddix.demo.entities.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

  public static void main(String[] args) {
//    var context = SpringApplication.run(StoreApplication.class, args);
    var user = User.builder().name("John").email("john@example.com")
        .password("password").build();
    var address = Address.builder().user(user).street("123 Main St")
        .city("New York").state("NY").zip("10001").build();
    user.addAddress(address);
    System.out.println(user);
  }
}
