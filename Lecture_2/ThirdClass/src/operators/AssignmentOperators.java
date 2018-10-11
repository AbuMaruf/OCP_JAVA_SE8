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
public class AssignmentOperators {
    public static void main(String args[]){
        
        int a = 100;
        int b = 200;
        int c = 300;
//        c = c+a;
        c+=a;
        System.out.println("The value of c is: " +c);
    }
}
