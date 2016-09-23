/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculation;

/**
 *
 * @author user
 */
public class Getallen {
    
    public void CalculNumbs(Double first, Double last) {
        
        Double add = first + last;
        Double subtract = first - last;
        Double divide = first / last;
        Double multi = first * last;
        
        System.out.println(String.format("%s + %s is %s", first,last,add));
        System.out.println(String.format("%s - %s is %s", first,last,subtract));
        System.out.println(String.format("%s / %s is %s", first,last,divide));
        System.out.println(String.format("%s * %s is %s", first,last,multi));
            
    }
    
}
