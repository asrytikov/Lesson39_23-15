package com.example.lesson39;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

@SpringBootApplication
public class Lesson39Application {

    public static void main(String[] args) {
        SpringApplication.run(Lesson39Application.class, args);
        /*double a = 0.1;
        double b = 0.2;
        System.out.println(a+b);

        BigDecimal a1 = BigDecimal.valueOf(0.1);
        BigDecimal a2 = BigDecimal.valueOf(0.2);
        BigInteger a3 = BigInteger.valueOf(1);
        System.out.println(a1.add(BigDecimal.valueOf(a3)));
        System.out.println(a1.divide(a2, RoundingMode.UP));
        System.out.println(a1.multiply(a2));
        System.out.println(a1.subtract(a2));
        double d3 = a2.doubleValue();*/
    }

}
