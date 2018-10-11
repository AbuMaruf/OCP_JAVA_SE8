/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DBA
 */
public class VariableTest {
    public static void main(String[] args) {
        Student s=new Student();
        s.display();
        s.show();
        
    }
    
}

class Student{
    int rollno = 100;
    public void display(){
        
        
        String name = "Maruf";
        
        System.out.println("Roll no is : " + rollno);
        System.out.println("Name is: "+ name);
    }
    public void show(){
        
        System.out.println("Roll no is: "+ rollno);
        String address = "Dhaka";
        
        System.out.println("Address is: "+ address);
        
    }


}
