package org.lab3;


import javax.swing.*;

abstract class Location {

    protected String name;

    public Location(String name) {

        this.name = name;
    }


    public String getName() {

        return this.name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public abstract void showAction() ;

}


