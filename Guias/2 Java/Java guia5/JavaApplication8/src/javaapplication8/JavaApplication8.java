/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;
import java.util.Scanner;
/**
 *
 * @author casad
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        
        System.out.println(frase.toLowerCase().equals("eureka"));
    }
    
}
