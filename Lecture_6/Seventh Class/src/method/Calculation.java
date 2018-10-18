/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

/**
 *
 * @author DBA
 */
public class Calculation {
    
    void sum(int a, int b){
        System.out.println(a+" "+b);
    }
    
    void sum (int a, int b, int c){
        System.out.println(a+" "+b+" "+c);
    }
    
    void sum (int a, int b, String c){
        System.out.println(a+" "+b+" "+c);
    }
    
    public static void main(String[] args) {
        Calculation obj = new Calculation();
        obj.sum(20, 30);
        obj.sum(25,35,45);
        obj.sum(10, 100, "Maruf");
    }
}
