/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

/**
 *
 * @author HP
 */
public class TestStringConcatenation {
    public static void main(String[] args) {
        String s1 = " Maruf";
        String s2 = "Abu";
        String s3 = s2+s1; // Concatenation with + operator
        System.out.println(s3);
        
        String s4 = 40+30+"Maruf"+30+20;
        System.out.println(s4);
        
        //Concatenation with concat() method
        
        String s5 = "Abu";
        String s6 = "Maruf";
        String s7 = s5.concat(s6);
        System.out.println(s7);
    }
    
}
