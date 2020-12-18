package org.lab3;
import org.lab3.Fire;
import org.lab3.Location;


public class Hall extends Location {

    Fire fire = null;

    public Hall(String name) {
        super(name);
    }

    public Hall(String name, Fire fire) {
        super(name);
        this.fire = fire;
    }

    public void showAction() {
        System.out.println("Локация " + this.getName() + " расцветилась объектом " + fire.getName());
    }
}