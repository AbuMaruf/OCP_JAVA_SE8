/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

import java.util.ArrayList;

/**
 *
 * @author DBA
 *
 */
//abstract class
public class PolymorphismTest {

    //private static Object group;

    public static void main(String[] args) {
        ArrayList <Human> group = new ArrayList <>();

        Male m = new Male();
        Female fm = new Female();
        group.add(m);
        group.add(fm);
        
        //group.add(new Male());
        //group.add(new Female());

        for (Human h : group) {
            h.say();
        }
    }

}

abstract class Human {

    public abstract void say();
}

class Male extends Human {

    @Override
    public void say() {
        System.out.println("Stand Up!");
    }
}

class Female extends Human {

    @Override
    public void say() {
        System.out.println("Sit Down!");
    }
}
