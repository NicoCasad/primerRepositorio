/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
import java.util.Scanner;
/**
 *
 * @author casad
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float farenheit, celcious;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados celcious");
        celcious = leer.nextFloat();
        farenheit = 32 + (9 * celcious / 5);
        
        System.out.println("Los grados celcious ingresados convertido a Farenheit dan como resultado " + farenheit);
    }
    
}
