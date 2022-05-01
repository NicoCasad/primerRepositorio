/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;
import java.util.Scanner;
/**
 *
 * @author casad
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int numero, doble, triple;
    double raiz;
    
        System.out.println("Ingrese un numero");
        numero = leer.nextInt();
        doble = numero * 2;
        triple = numero * 3;
        raiz = Math.sqrt(numero);
        
        System.out.println("El doble del numero es: " + doble);
        System.out.println("El triple del numero es: " + triple);
        System.out.println("La raiz cuadrada del numero es:" + raiz);
    }
    
}
