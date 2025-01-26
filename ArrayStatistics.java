/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraystatistics;

/**
 *
 * @author Gift Umoh
 */
import java.util.Arrays;
public class ArrayStatistics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[]data = {2,5,5,9,4,7,0,9,6,11,12};
       
       double mean = mean(data);
       System.out.println("Mean: "+mean);
       
       double median =  median(data);
       System.out.println("Median: "+median);
       
       double StdDev = standardDeviation(data, mean);
       System.out.println("Standard Deviation: "+StdDev);
       
    }
    
    public static double mean(int[]arr){
        double sum = 0;
        for(int num: arr){
            sum+= num;
        }
        return sum/arr.length;
    }
    
    public static double median(int[]arr){
        Arrays.sort(arr);
        int n = arr.length;
        
        if (n%2 == 0){
            return(arr[n/2-1] + arr[n/2])/2.0;
        }else{
            return arr [n/2];
        }
    }
    
    public static double standardDeviation(int[]arr, double mean){
        double sumSquaredDifferences = 0;
        for(int num : arr){
            sumSquaredDifferences += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumSquaredDifferences/arr.length);
    }
    
}
