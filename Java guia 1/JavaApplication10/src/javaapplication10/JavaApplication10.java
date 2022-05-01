/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;
import java.util.Scanner;
/**
 *
 * @author casad
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase, letraFrase;
        
        System.out.println("Ingrese una frase que comience con la letra A");
        frase = leer.nextLine();
        letraFrase = frase.substring(0, 1).toUpperCase();
        System.out.println(letraFrase.equals("A"));
    }
    
}
