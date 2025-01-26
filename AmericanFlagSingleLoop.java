/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package americanflagsingleloop;

/**
 *
 * @author Gift Umoh
 */
public class AmericanFlagSingleLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rows = 6;
        int cols = 14;
        
        for(int i = 0; i<rows*cols; i++){
            int row = i/cols;
            int col = i%cols;
            
            if(row < 3){
                if(col < 7){
                    System.out.print("*");
                }else{
                    System.out.print("=");
                }
            }else{
                System.out.print("=");
            }
            if(col == cols-1){
                System.out.println();
            }
        }
    }
}
