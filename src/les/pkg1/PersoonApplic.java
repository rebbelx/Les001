/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les.pkg1;

import java.util.Scanner;
/**
 *
 * @author user
 */
public class PersoonApplic {
    
    static Scanner myInput = new Scanner(System.in);
    
    public static void main(String args []) {
    
        System.out.print("Graag jouw voornaam: ");
        String firstName = myInput.nextLine();
        
        System.out.print("en familienaam: ");
        String lastName = myInput.nextLine();
        
        System.out.print("graag ook jou woonplaats: ");
        String birthPlace = myInput.nextLine();
        
       System.out.println(String.format("Welkom %s van de familie %s uit %s", firstName,lastName,birthPlace));
             
               
        
    }
    
}
