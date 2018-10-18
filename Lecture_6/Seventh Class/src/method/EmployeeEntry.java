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
public class EmployeeEntry implements EmployeeInterface{

   int id = 101;
   String name = "Maruf";
   int age = 35;
           
    
    @Override
    public void show() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("id is: "+id);
        System.out.println("name is: "+name);
        System.out.println("age is: "+age);
    }

    

    @Override
    public void display(int a, String b, int c) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       System.out.println("id is: "+id);
       System.out.println("name is: "+name);
       System.out.println("age is: "+age); 
    }
    
}
