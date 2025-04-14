package me.temeddix.demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class HeavyResource {
    public HeavyResource() {
        // This constructor wouldn't be called until the bean is used.
        System.out.println("Heavy resource created");
    }
}
