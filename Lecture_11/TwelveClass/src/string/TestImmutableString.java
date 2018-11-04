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
public class TestImmutableString {
    public static void main(String[] args) {
        String s = "Abu Maruf";
        s.concat("Md Shaifullah"); //concat() method adds the string at the end
        System.out.println(s); // will print only Abu Maruf because string is immutable objects
    }
    
}
