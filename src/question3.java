/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omwas
 */
public class question3 {
    public static void main(String[] args) {
    //Question3
  
    double gcd1=greatestCommonDivisor (24,18);
     double gcd2= greatestCommonDivisor(10,5);
      double gcd3= greatestCommonDivisor(14,30);
       double gcd4= greatestCommonDivisor(36,60);
     
    
    
        System.out.println("greatestCommonDivisor(24,18)"+gcd1);
        System.out.println("greatestCommonDivisor(24,18)"+ gcd2);
        System.out.println("greatestCommonDivisor(10,5)"+gcd3 );
        System.out.println("greatestCommonDivisor(45,30)"+gcd4);
           
    }
    
    public static double greastestCommonDivisor( double a, double b){
        while(b!=0){
            if( a>b){
                a=a-b;
                b=b-a;
            }
        }
        return a;
    }
    
}
