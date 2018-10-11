/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopstatement;

/**
 *
 * @author DBA
 */
public class BreakAndContinueCheck {
    public static void main(String[] args) {
        System.out.println("The value of a is: ");
        
        for(int a =1; a<=10; a++){
            if(a == 5){
               //btrak;
                continue;
            }
            System.out.println(a);
        }
    }
    
}
