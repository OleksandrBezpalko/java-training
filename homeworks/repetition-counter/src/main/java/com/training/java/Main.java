package com.training.java;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(
                -4, 0, 5, 3, 0, 1, 3, 5, -5, -5, -5, -2, -4, 2, -3, 1, 0, 1, 5, -3
        ));

        Map<Integer, Integer> map = new HashMap<>();
        list.stream().forEach(key -> map.put(key, map.getOrDefault(key, 0) + 1));

        map.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry<Integer, Integer>::getKey))
                .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
    }
}