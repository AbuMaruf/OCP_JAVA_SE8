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
public class RelationOperators {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age =input.nextInt();
        int b=18;
        
        
//        int a = 100;
//        int b = 200;
        
        if(age >= b){
            System.out.println("You're welcome to vote.");
        }else{
            System.out.println("You're not allowed to vote.");
        }
        
    }
    
}
