package me.temeddix.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {
    public static void main(String[] args) {
//		SpringApplication.run(StoreApplication.class, args);
        var orderService = new OrderService(new PayPalPaymentService());
        orderService.placeOrder();
    }
}
