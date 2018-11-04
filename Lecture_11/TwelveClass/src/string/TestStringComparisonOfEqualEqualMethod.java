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
public class TestStringComparisonOfEqualEqualMethod {
    public static void main(String[] args) {
        String s1 = "Maruf";
        String s2 = new String("Maruf");
        String s3 = "Maruf";
        System.out.println(s1==s2); // false because == checks memory location
        System.out.println(s1==s3); // true 
    }
    
}
