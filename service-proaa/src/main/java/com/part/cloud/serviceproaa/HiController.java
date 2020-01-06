package com.part.cloud.serviceproaa;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String home(@RequestParam String name) {
        System.out.println("hi "+name+",i am from port:" +port);
        return "hi "+name+",i am from port:" +port;
    }

}
