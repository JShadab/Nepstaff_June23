package com.nepstaff.demo.beans;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

    private final Processor processor;

    public Laptop(Processor processor) {
        this.processor = processor;
    }

    public void boot(){
        System.out.println("Laptop is booting.");
        processor.start();
    }

}
