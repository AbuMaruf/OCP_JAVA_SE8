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
public class TestStringComparisonOfEqualMethods {
    public static void main(String[] args) {
        String s1 = "Maruf";
        String s2 = "Maruf";
        String s3 = new String("Maruf");
        String s4 = "Shaifullah";
        String s5 = "MARUF";
        
        System.out.println(s1.equals(s2)); //Same Value
        System.out.println(s1.equals(s3)); //Same Value
        System.out.println(s1.equals(s4)); // Value Different
        System.out.println(s1.equals(s5)); // Case Sensitive
    }
    
}
