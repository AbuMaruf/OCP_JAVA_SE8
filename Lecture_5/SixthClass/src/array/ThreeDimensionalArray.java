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
public class ThreeDimensionalArray {
    public static void main(String[] args) {
        
        int student_exam_mark [][][] = new int [3][2][2];
        
        student_exam_mark [0][0][0] = 60;
        student_exam_mark [0][0][1] = 70;
        student_exam_mark [0][1][0] = 50;
        student_exam_mark [0][1][1] = 80;
        
        student_exam_mark [1][0][0] = 40;
        student_exam_mark [1][0][1] = 45;
        student_exam_mark [1][1][0] = 64;
        student_exam_mark [1][1][1] = 54;
        
        
        student_exam_mark [2][0][0] = 80;
        student_exam_mark [2][0][1] = 75;
        student_exam_mark [2][1][0] = 46;
        student_exam_mark [2][1][1] = 86;
        
       
        
        for ( int sno = 0; sno < student_exam_mark.length; sno++){
            System.out.println("Student no: " + (sno + 1));
            for ( int exam = 0; exam < student_exam_mark[sno].length; exam++){
                System.out.println("Exam No: " + (exam + 1));
                System.out.println("Marks Are: " );
                for ( int marks =0; marks < student_exam_mark[sno][exam].length; marks++){
                    System.out.print("" + student_exam_mark[sno][exam][marks]+"\t");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
    
}
