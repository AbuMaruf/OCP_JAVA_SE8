
import anotherpackage.Animal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DBA
 */
public class Cow extends Animal {
    public static void main(String[] args) {
        
        Animal a = new Animal();
        Cow c1 = new Cow();
        Animal c2 = new Cow();
//        Cow c3 = (Cow) new Animal(); //Compile time error 
        
        System.out.println(a instanceof Animal);
        System.out.println(c1 instanceof Cow);
        System.out.println(c2 instanceof Animal);
//        System.out.println(c3 instanceof Animal);
    
}
}
