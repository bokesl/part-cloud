package com.part.cloud.serviceconbb;


import org.springframework.stereotype.Component;

@Component
public class ConbbFeignHystrix implements ConbbFeign {

    @Override
    public String sayHi(String name) {
        return "sorry "+name;
    }

}
