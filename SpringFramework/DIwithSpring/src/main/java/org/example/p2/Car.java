package org.example.p2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("car")
@Scope(scopeName = "prototype")
public class Car {

    @Autowired
    @Qualifier("dieselEngine")
    private Engine engine;

    public void move() {
        engine.start();
        System.out.println("Car is moving...");
    }
}
