package com.company.penUML.model;

public class Kernel {
    private String name;
    private String color;

    public Kernel(String name, String color) {
        this.name = name;
        this.color = color;

    }

    @Override
    public String toString() {
        return "Kernel{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
