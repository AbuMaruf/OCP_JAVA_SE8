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
public class TestStringClassMethods {
    public static void main(String[] args) {
        // toUpperCase() and toLowerCase() method
        String s = "MaRuF";
        System.out.println(s);
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        
        
        // Java Trim method
        
        String s1 = " Maruf";
        System.out.println(s1.trim());
        
        // Java String startsWith() and endsWith() method
        
        String s2 = "Maruf";
        System.out.println(s2.startsWith("Ma"));
        System.out.println(s2.endsWith("ru"));
        
        
        // Java String charAt() method
        
        String s3 = "Shaifullah";
        System.out.println(s3.charAt(2));
        
        //Java String length() method
        
        String s4 = "Maruf";
        System.out.println(s4.length());
        
        // Java String intern() method
        
        String s5 = new String("Maruf");
        String s6 = s5.intern();
        System.out.println(s6);
        
        //Java String valueof() method
        
        int a = 10; 
        String s7 = String.valueOf(a);
        System.out.println(s7+10);
        
        //Java String replace() method
        
        String s8 = "Dhaka is a capital of Bangladesh. Dhaka is a land of mosque. ";
        String replaceString = s8.replace("Dhaka", "Rangpur");
        System.out.println(replaceString);
        
    }
    
}
