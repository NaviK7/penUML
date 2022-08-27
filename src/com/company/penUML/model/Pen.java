package com.company.penUML.model;

public class Pen {
    private Kernel kernel;
    private Spring spring;
    private Body body;

    public Pen(Kernel kernel, Spring spring, Body body) {
        this.kernel = kernel;
        this.spring = spring;
        this.body = body;
    }


    public Pen() {

    }

    @Override
    public String toString() {
        return "Pen{" +
                "kernel=" + kernel +
                ", spring=" + spring +
                ", body=" + body +
                '}';
    }
}
