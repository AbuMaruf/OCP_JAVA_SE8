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
public class TestImmutableString1 {
    public static void main(String[] args) {
        String s = "Abu Maruf";
        s = s.concat(" Md Shaifullah"); //reference variable
        System.out.println(s);
        
    }
    
}
