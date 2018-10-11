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
public class MultiDimentionalArray {
    public static void main(String[] args) {
        
        String names [][] = new String [3][4];
        
        names[0][0] = "Apple";
        names[0][1] = "Orange";
        names[0][2] = "Banana";
        names[0][3] = "Pineapple";
        
        names[1][0] = "Roni";
        names[1][1] = "Joni";
        names[1][2] = "Anik";
        names[1][3] = "Sobuj";
        
        names[2][0] = "Bangladesh";
        names[2][1] = "Inadia";
        names[2][2] = "USA";
        names[2][3] = "Canada";
        
//        int rows = 2;
//        int columns = 3;
//        
//        for ( int i = 0; i <= rows; i++){
//            for (int j =0; j <= columns; j++){
//                System.out.println(names[i][j]+" ");
//            }
//            System.out.println();
//        }
        
        for(int i=0; i < names.length; i++){
            
            for(int j=0; j <names[i].length; j++){
                
                System.out.println(names[i][j]+" ");
            }
            System.out.println();
        }
                
        
    }
    
}
