/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetGet;

import java.util.ArrayList;

/**
 *
 * @author DBA
 */
public class StudentMain {
    
  //  ArrayList al = new ArrayList();
   // ArrayList<Product> productlist = new ArrayList<Product>
    
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Maruf");
        
        System.out.println(""+s.getName());
    }
    
}
