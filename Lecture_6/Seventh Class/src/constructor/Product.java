/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author DBA
 */
public class Product {
    
    int productid;
    String productname;
    int price;
    
    public Product(){
        productid=100;
        productname ="Laptop";
        price= 50000;
        
            System.out.println("Product is: "+productid);
            System.out.println("Product name is: "+productname);
            System.out.println("Product price is: "+price);
        
    }
  
    public Product(int a, String b, int c){
        productid=a;
        productname =b;
        price=c;
        
            System.out.println("Product id is: "+productid);
            System.out.println("Product name is: "+productname);
            System.out.println("Product price is: "+price);
        
    }
    
 public void multiply(){
     System.out.println("Meltypling Method");
     
 }   
}
