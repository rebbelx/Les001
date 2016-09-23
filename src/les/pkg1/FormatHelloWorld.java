/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les.pkg1;

/**
 *
 * @author user
 */
public class FormatHelloWorld {
    
    public static void main(String[] args) {
        
        
        String s = "Hello World";
        
        System.out.println(String.format("1a. De tekst '%s' elk woord op een lijn \n%s", s, s.replace(" ", "\n")));
        System.out.println(String.format("2. volgende zijn de 2de: %s, 4de: %s, en de 7de: %s letter uit de tekst '%s'", 
                s.charAt(1), s.charAt(3),s.charAt(6), s));
        
        System.out.println(String.format("3. de zoektekst '%s' in de tekst '%s' begint op positie %s", 
                s.subSequence(1, 5),s,s.indexOf("e")+1));
        
        System.out.println(String.format("4. de laatste letter 'o' in de tekst %s staat op positie %s" , s, s.lastIndexOf("o")+1));
        System.out.println(String.format("5. de tekst '%s' in hoofdletters is %s", s, s.toUpperCase()));
        
        
    }
    
}
