package org.lab3;

import java.util.Objects;

public class Family implements Direction {

    private String name = "Семейство";


    @Override
    public void changeDirection() {
        System.out.println(name + " посмотрело в направлении " + Directions.CEILING);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return name.equals(family.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
