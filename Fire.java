package org.lab3;


public class Fire implements ableToLight {

    private final String name;

    public Fire(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void LightUp() {
        System.out.println(name + " зажёгся в направлении " + Direction.Directions.FLOOR);

    }
}
