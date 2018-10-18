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
public class ClaculationTwo {
    
    int sum(int a, int b){
        System.out.println(a+" "+b);
        return 10;
    }
    
    double sum (int a, int b){
        System.out.println(a+" "+b);
        return 0;
    }
    
//    void sum (int a, int b, String c){
//        System.out.println(a+" "+b+" "+c);
//    }
    
    public static void main(String[] args) {
        ClaculationTwo obj = new ClaculationTwo();
        
        int result = obj.sum(20, 20);//Compile TIme Error
    }
    
}
