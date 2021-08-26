package pl.sda.enums;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream.of(CarType.values()).forEach(System.out::println);
        System.out.println(CarType.valueOf("HATCHBACK") == CarType.HATCHBACK); // true
        System.out.println(CarType.HATCHBACK.name()); // HATCHBACK
    }
}
