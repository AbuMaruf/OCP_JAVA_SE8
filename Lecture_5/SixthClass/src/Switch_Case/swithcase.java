/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch_Case;

import java.util.Scanner;

/**
 *
 * @author DBA
 */
public class swithcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Value1 to 7: ");
        
        int a = sc.nextInt();
        String day = null;
        switch(a){
            
            case 1:
                day = "Saturday";
                break;
                
            case 2:
                day = "Sunday";
                
                break;
                
            case 3:
                day = "Monday";
                break;
                
            case 4:
                day = "Tuesday";
                break;
                
            case 5:
                day = "Wednesday";
                break;
                
            case 6:
                day = "Trusday";
                break;
                
            case 7:
                day = "Friday";
                break;    
                
            default:
                System.out.println("Your number is out of range");
                
            
        }
        
        System.out.println("The day is "+ day);
        
    }
    
}
