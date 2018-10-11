/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators;

/**
 *
 * @author DBA
 */
public class Increment_Decrement_Operator {
    
    public static void main(String args[]){
        
        int a = 100;
        System.out.println("The vaue of a = "+a);
        ++a;
        System.out.println("The value of a is: "+a);
        
        int b = 100;
        System.out.println("The value of b is: "+b);
        b++;
        System.out.println("The value of b is: "+b);
        
        int c = 20;
        System.out.println("The value of c is: "+c);
        ++c;
        System.out.println("The value of c now is: "+c);
        int d = c++;
        System.out.println("The value of d is: "+d);
        int e = ++c;
        System.out.println("The value of e is: "+e);
        
        
    }
    
}
