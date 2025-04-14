package me.temeddix.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/")
    public String index() {
        return "index.html";
    }

    @GetMapping("/name")
    @ResponseBody
    public String name() {
        return appName;
    }
}
