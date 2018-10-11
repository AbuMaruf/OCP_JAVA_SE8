/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author DBA
 */
public class SingleDimentionalArray {
    public static void main(String[] args) {
        //int number[]={10,20,30,40,50};
        //Try at home with string
        int number [] = new int [5];
        number[0]= 100;
        number[1]= 200;
        number[2]= 300;
        number[3]= 400;
        number[4]= 500;
        
        //System.out.println(number[4]);
        
        for (int a=0; a <=4;a++){
            System.out.println(number[a]);
        }
    }
}
