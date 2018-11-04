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
public class TestStringCompareToMethod {
    public static void main(String[] args) {
        String s1 = "Maruf";
        String s2 = "Maruf";
        String s3 = "Shaifullah";
        String s4 = "Abu";
        
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
        System.out.println(s4.compareTo(s1));
  
    }
    
}
