package pl.sda.enums;

public enum CarType {
    HATCHBACK("hatchback"),
    SEDAN("limousine"),
    SUV("SUV"),
    CROSSOVER("cross-over");

    private final String name;

    CarType(String name) {
        this.name = name;
    }
}