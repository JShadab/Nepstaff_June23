package org.example.p1;

public class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine= engine;
       // engine = new PetrolEngine();
      //  engine = new DieselEngine();
    }

    public void move() {
        engine.start();
        System.out.println("Car is moving...");
    }
}
