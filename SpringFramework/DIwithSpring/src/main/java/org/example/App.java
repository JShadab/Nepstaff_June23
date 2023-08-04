package org.example;

import org.example.p2.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class); // Inversion Of Control

        Car c1 = context.getBean(Car.class);
        Car c2 = context.getBean(Car.class);
        Car c3 = context.getBean(Car.class);
        Car c4 = context.getBean(Car.class);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);


        System.out.println("DONE!!");
    }
}
