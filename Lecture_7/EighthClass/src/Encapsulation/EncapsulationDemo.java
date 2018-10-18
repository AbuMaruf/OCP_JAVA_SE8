/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

/**
 *
 * @author DBA
 */
public class EncapsulationDemo {
    
    public static void main(String[] args) {
        
        
        EncapsulationTest ed = new EncapsulationTest();
        
        ed.setEmpName("Maruf");
        ed.setEmpAge(25);
        ed.setSsn(1010);
        
        System.out.println("Employee Name: "+ed.getEmpName());
        System.out.println("Employee SSN: "+ed.getSsn());
        System.out.println("Employee Age: "+ed.getEmpAge());
    }
    
}
