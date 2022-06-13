/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import java.util.Scanner;
/**
 *
 * @author casad
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero, numero1;
        
        System.out.println("Ingrese dos numeros para comparar");
        numero = leer.nextInt();
        numero1 = leer.nextInt();
        
        if(numero > numero1){
            System.out.println("El numero mas grande es: " + numero);                                     
        }else if(numero < numero1){
            System.out.println("El numero mas grande es: " + numero1);
        }else if(numero == numero1){
            System.out.println("Los numeros ingresados son iguales, no hay uno mayor que otro");
        }
        }
    
}
