/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author Gift Umoh
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rows = 6;
        int cols = 15;
        
        for (int i =1; i<= rows*cols;i++){
            if (i % cols <= cols / 3 && i % cols != 0){
                System.out.print(" * ");
            }else if (i % cols >cols / 3 && i% cols <= 2 * cols /3){
                System.out.print(" = ");
            }else if (i%cols != 0){
                System.out.print(" * ");
            }
            if (i%cols ==0){
                System.out.println();
            }
        }
        
        
    }
    
}
