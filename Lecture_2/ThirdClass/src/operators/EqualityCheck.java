/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators;

import java.util.Scanner;

/**
 *
 * @author DBA
 */
public class EqualityCheck {
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
     
        System.out.println("Enter Username: ");
        String user = input.next();
        
        System.out.println("Enter Password: ");
        String pass = input.next();
        
        String a = "Dhaka";
        String b = "Khulna";
        
        if (user.equals(a) && pass.equals(b)){
            
            System.out.println("Login is successful!");
        }else{
            
            System.out.println("Login is not succesfull!");
        }
    }
    
}
