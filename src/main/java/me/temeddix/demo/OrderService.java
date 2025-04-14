package me.temeddix.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final PaymentService paymentService;

    public OrderService(@Qualifier("stripe") PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("Order service created");
    }

    @PostConstruct
    public void init() {
        System.out.println("After order service creation");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Before order service destruction");
    }

    public void placeOrder() {
        paymentService.processPayment(10);
    }
}
