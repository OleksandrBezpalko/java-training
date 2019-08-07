package com.training.java;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("AA1111BX", 2007),
                new Car("AK5555IT", 2010),
                new Car(null, 2012),
                new Car("", 2015),
                new Car("AI3838PP", 2017));

        //The original code

        cars.stream()
                .filter(c -> c.getYear() > 2010)
                .map(Car::getNumber)
                .filter(s -> s != null && !s.isEmpty())
                .forEach(System.out::println);

        //Modified code

        cars.stream()
                .filter(c -> c.getYear() > 2010)
                .filter(c -> c.getNumber() != null && !c.getNumber().isEmpty())
                .forEach(c -> System.out.println(c.getNumber()));

        //Alternate modified code

        cars.stream()
                .filter(c -> c.getYear() > 2010)
                .filter(c -> c.getNumber() != null && !c.getNumber().isEmpty())
                .map(Car::getNumber)
                .forEach(System.out::println);
    }
}