package com.training.java;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer>arrayList=new ArrayList<>();
        arrayList.add(5);
        SuperArray<Integer> array = new SuperArray<>(arrayList);
        array.add(1);
        array.add(2);
        array.add(7);
        array.add(9);
        array.set(2,5);
        System.out.println(array.toString());
        System.out.println("size: "+array.size());
        System.out.println("capacity: "+array.capacity());
    }
}
