package com.part.cloud.serviceconaa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;


@RestController
public class HiController {


    @Resource
    ConaaFeign conaaFeign;

    @GetMapping("/hi")
    public String sayHi(@RequestParam( defaultValue = "forezp",required = false)String name){
        return conaaFeign.sayHi(name);
    }

}
