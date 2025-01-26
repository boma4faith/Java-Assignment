/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nigeriaflagnestedloop;

/**
 *
 * @author Gift Umoh
 */
public class NigeriaFlagNestedLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rows = 6;
        int cols =15;
        
        for(int i = 0; i< rows; i++){
            for(int j = 0; j < cols; j++){
                if(j<cols/3){
                System.out.print("*");
                }else if (j < 2 * cols/3){
                    System.out.print('=');
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
       
    }
    
}
