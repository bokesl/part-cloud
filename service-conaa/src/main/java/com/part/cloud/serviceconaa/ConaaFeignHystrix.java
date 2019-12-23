package com.part.cloud.serviceconaa;


import org.springframework.stereotype.Component;

@Component
public class ConaaFeignHystrix implements ConaaFeign {

    @Override
    public String sayHi(String name) {
        return "sorry "+name;
    }

}
