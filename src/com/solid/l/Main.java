package com.solid.l;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>();
        integerList.add(10);
        integerList.add(11);
        integerList.add(12);
        integerList.add(13);

        List<String> stringList = new ArrayList<>();
        IntStream.rangeClosed(1, 7).forEach(i ->
            stringList.add(String.format("A%d", i))
        );

        List<Integer> concurrentIntegerList = new ArrayList<>();

        IntStream.rangeClosed(50, 70).
            parallel().
            forEach(f -> concurrentIntegerList.add(f));

        integerList.forEach(System.out::println);

        System.out.println("====================");

        stringList.forEach(System.out::println);

        System.out.println("====================");

        concurrentIntegerList.forEach(System.out::println);
    }
}
