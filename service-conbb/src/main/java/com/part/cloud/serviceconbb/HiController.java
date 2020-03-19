package com.part.cloud.serviceconbb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class HiController {


    @Resource
    ConbbFeign conbbFeign;

    @GetMapping("/hi")
    public String sayHi(@RequestParam( defaultValue = "forezp",required = false)String name){
        System.out.println("hi "+name);
        return conbbFeign.sayHi(name);
    }

}
