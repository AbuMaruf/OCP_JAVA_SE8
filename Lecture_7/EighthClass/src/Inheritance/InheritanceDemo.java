/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author DBA
 */

class Square{
        int length, breadth;
        public void get(int x, int y)
                
        {
            length = x;
            breadth = y;
        }            
        int area(){
            return(length*breadth);
        }
    }
    
class Cube extends Square{
        int height;
        public void getdata(int x, int y, int z){
            get (x,y);
            height=z;
        }
        int volume(){
            return(length*breadth*height);
        }
    }


public class InheritanceDemo {
    public static void main(String[] args) {
        
        Cube c = new Cube();
        c.getdata(2, 4, 8);
        int b1 = c.area();
        System.out.println("Area of Square: "+b1);
        int b2 = c.volume();
        System.out.println("Volume of Cube: "+b2);
        
    } 
}
