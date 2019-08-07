package com.training.java;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int array [] = {
                -11, 34, 18, 42, 27, 7, 0, 22, 31, -34, 0, -24, -43, -23, 14, -44, 46, 15, -8, -31
        };
        int multiplier = 2;

        double average = Arrays.stream(array).average().getAsDouble();

        Pair<Integer, Integer> min = IntStream
                .range(0, array.length)
                .mapToObj(i -> new Pair<>(i, array[i]))
                .min(Comparator.comparing(Pair::getValue))
                .get();

        int zerosAmount = (int) Arrays.stream(array).filter(e -> e == 0).count();

        int positiveAmount = (int) Arrays.stream(array).filter(e -> e > 0).count();

        IntStream.range(0, array.length).forEach(i -> array[i] *= multiplier);

        System.out.println("Average: " + average);
        System.out.println("Minimum(index, value): " + min.getKey() + ", " + min.getValue());
        System.out.println("Amount of zeros: " + zerosAmount);
        System.out.println("Amount of positive values: " + positiveAmount);
        System.out.print("Doubled array: ");
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
        System.out.println();
    }
}