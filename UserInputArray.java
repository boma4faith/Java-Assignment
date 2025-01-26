/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package userinputarray;

/**
 *
 * @author Gift Umoh
 */
import java.util.Scanner;
public class UserInputArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]numbers = new int[10];
        Scanner scanner = new Scanner(System.in);
        
        for (int i=0; i<numbers.length;i++){
            System.out.print("Enter a value for index "+ i + " : ");
            numbers[i] = scanner.nextInt();
        }
         System.out.println("\n The values entered are; ");
         for(int num : numbers){
             System.out.println(num);
         }
         scanner.close();
    }
    
}
