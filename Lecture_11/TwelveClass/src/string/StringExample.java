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
public class StringExample {
    public static void main(String[] args) {
        String s1 = "Java"; //Creating String by java String Literal
        char ch[] = {'S','T','R','I','N','G','S'};
        String s2 = new String(ch); // Converting char array into string
        String s3 = new String("Example"); // Creating Java string by new keyword
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
    
}
