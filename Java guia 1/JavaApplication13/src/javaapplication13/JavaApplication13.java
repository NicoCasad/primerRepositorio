/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;
import java.util.Scanner;
/**
 *
 * @author casad
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero, suma;
        suma = 0;
        
        System.out.println("Ingrese el numero limite");
        numero = leer.nextInt();
        
        while(numero >= suma){
            System.out.println("Ingrese un numero para sumar y superar al limite");
            suma = suma + leer.nextInt();
        }
    }
    
}
