/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package americanflagnestedloop;

/**
 *
 * @author Gift Umoh
 */
public class AmericanFlagNestedLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rows = 6;
        int cols =14;
        
        for(int i = 0; i<rows; i++){
            for(int j =0; j<cols; j++){
                if(i<3){
                    if(j<7){
                        System.out.print("*");
                    }else{
                        System.out.print("=");
                    }
                }else{
                    System.out.print("=");
                }
            }
            System.out.println();
        }
    }
    
}
