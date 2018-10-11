/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package evenandodd;

import java.util.Scanner;

/**
 *
 * @author DBA
 */
public class EvenOddFinder {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int a = scan.nextInt();
        
        if (a%2==0){
            System.out.println("a is a even number");
        }else{
            System.out.println("a is a odd number");
        }
        
        
    }
   
    
}
