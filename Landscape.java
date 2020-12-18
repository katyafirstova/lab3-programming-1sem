package org.lab3;


public enum Landscape  {

    Sea("море");

    private String name;

    Landscape(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}