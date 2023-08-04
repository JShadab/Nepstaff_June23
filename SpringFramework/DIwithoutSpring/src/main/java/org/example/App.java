package org.example;

import org.example.p1.Car;
import org.example.p1.DieselEngine;
import org.example.p1.Engine;
import org.example.p1.PetrolEngine;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Engine pEngine = new PetrolEngine();
        Car c1 = new Car(pEngine);
        c1. move();


        Engine dEngine = new DieselEngine();
        Car c2 = new Car(dEngine);
        c2. move();

       // System.out.println( "Hello World!" );
    }
}
