/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package twodimensionalarray;

/**
 *
 * @author Gift Umoh
 */
import java.util.Scanner;
public class TwoDimensionalArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Enter values for a 10 x 10 2Darray: ");
        for(int i = 0; i<10; i++){
            for(int j =0; j<10;j++){
                System.out.print("Enter value for position ["+ i + "]["+ j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\n The value entered in the 10 x 10 2D array are: ");
        for(int[]row : array){
            for(int value : row){
                System.out.print(value + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
    
}
