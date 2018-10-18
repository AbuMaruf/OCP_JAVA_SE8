/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

/**
 *
 * @author DBA
 */
public class Student {

    int id;
    String name;
    int age;

    public void display(int a, String b, int c) {

//        Student s = new Stuent();
//        s.id=a;
        
//        this.id = a;
//        this.name = b;
//        this.age = c;

        id = a;
        name = b;
        age =c;
        
        System.out.println("Id is: " + id);
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);

    }
    
    int x,y;
    public void add(int num1, int num2){
        this.x=num1;
        this.y=num2;
        
        //System.out.println(x+y);
        //return x+y;
    }

}
