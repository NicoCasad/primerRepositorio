/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;
import java.util.Scanner;
/**
 *
 * @author casad
 */

public class JavaApplication12 {

    public static void numeroCorrecto(int numero, Scanner leer){
        System.out.println("Ingrese un numero entre 0 y 10");
        numero = leer.nextInt();
        if(numero < 10 & numero > -1){
            System.out.println("correcto");
        }else{
            System.out.println("Incorrecto");
            numeroCorrecto(numero, leer);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int numero;
       numero = 0;
       numeroCorrecto(numero, leer);
    }
    
}
