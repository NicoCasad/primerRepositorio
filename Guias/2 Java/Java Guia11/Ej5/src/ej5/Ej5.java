/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author casad
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 600, numeroAdivinar, contador = 0;
        Random random = new Random();
        Scanner leer = new Scanner(System.in);
        numeroAdivinar = random.nextInt(500);
        do{
            
            try{
                System.out.println("Ingrese el numero que cree que es correcto");
                numero = leer.nextInt();
                
            }catch(InputMismatchException ime){
                System.out.println(ime.fillInStackTrace());
                leer.nextLine();
            }
            finally{
                contador += 1;
                
            }
        }while(numero != numeroAdivinar);
        System.out.println("Elnumero de intentos fue de: " + contador);
        System.out.println("numero correcto: " + numeroAdivinar);
    }
    
}
