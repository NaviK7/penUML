package com.company.penUML.model;

public class Body {
    private String name;

    public Body(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Body{" +
                "name='" + name + '\'' +
                '}';
    }
}
