package org.lab3;

public class Show {

    public static void main(String [] args) {
        Fire fire = new Fire("огонь");
        Hall hall = new Hall("зал", fire);
        Family family = new Family();
        Bulbs bulbs = new Bulbs();
        
        hall.showAction();
        family.changeDirection();
        bulbs.turnOnLight();
        bulbs.reflect();
        fire.LightUp();
    }
}
