/* This is the main class, asking the user for 2 numbers and then creating an instance of Getallen.java which performs the calculations. 
*
*/
package Calculation;

import java.util.Scanner;

public class RekenApplic {
    
    static Scanner myInput = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Double a, b;
        
        System.out.print("Enter the first number:");
        a = myInput.nextDouble();
        
        System.out.print("Enter the second number:");
        b = myInput.nextDouble();
        
        Getallen calcObj = new Getallen();
        calcObj.CalculNumbs(a, b);
        
        
    }
}
