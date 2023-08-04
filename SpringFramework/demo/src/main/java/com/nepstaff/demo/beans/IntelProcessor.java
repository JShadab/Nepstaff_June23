package com.nepstaff.demo.beans;

import org.springframework.stereotype.Component;

@Component
public class IntelProcessor implements Processor {
    @Override
    public void start() {
        System.out.println("using Intel Processor");
    }
}
