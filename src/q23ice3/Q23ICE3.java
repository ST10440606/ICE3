/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q23ice3;



/**
 *
 * @author omwas
 */
public class Q23ICE3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Question 2
       
       double max = 1230; // this is my limit 
       long sum = oddSquareSum(max);
        System.out.println("sum the square of odd numbers up to"+ max + sum);
        
      
        
       
    }
    // Question2 
    public static long 
            oddSquareSum(double max){
                long sum = 0;
                for(double y = 1; y< max;y+=2){
                    sum += y*y;
                }
                return sum;
            }
            
            
}
