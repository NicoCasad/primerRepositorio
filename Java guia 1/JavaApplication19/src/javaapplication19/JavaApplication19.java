/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;
import java.util.Scanner;
/**
 *
 * @author casad
 */

public class JavaApplication19 {
    
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float euros;
        
        System.out.println("Ingrese el valor en euros");
        euros = leer.nextFloat();
        
        conversionMoneda(euros, leer);
    }
    public static void conversionMoneda(float euros, Scanner leer){
        String moneda;
        
        System.out.println("Ingrese el tipo de moneda al que quiere convertir los euros");
        moneda = leer.nextLine();
        
        switch(moneda){
            case "yen":
                System.out.println(euros * 129.852);
                break;
            case "dolar":
                System.out.println(euros * 1.28611);
                break;
            case "libra":
                System.out.println(euros * 0.86);
                break;
            default:
                System.out.println("Moneda no disponible");
        }
    }
}
