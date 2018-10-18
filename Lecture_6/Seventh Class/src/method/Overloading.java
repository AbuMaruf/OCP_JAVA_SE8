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
public class Overloading {
    
    public static void main(int a){
            System.out.println(a);
    }
    
    public static void main(int a, int b){
            System.out.println(a+b);
    }
    
    public static void main(String[] args) {
        System.out.println("main()method invoked");
        main(100);
        main(500,100);
        
    }
    
}
