package model;

public class Car {
    private int id;
    private String name;
    private double price;

    public Car setId(int id) {
        this.id = id;
        return this;
    }

    public Car setName(String name) {
        this.name = name;
        return this;
    }
}
