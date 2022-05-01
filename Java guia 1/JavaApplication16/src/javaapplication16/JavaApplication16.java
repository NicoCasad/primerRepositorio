/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;
import java.util.Scanner;
/**
 *
 * @author casad
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        int contadorCorrectas, contadorIncorrectas;
        contadorCorrectas = 0;
        contadorIncorrectas = 0;
        
        do{
            System.out.println("Ingrese una frase valida");
            frase = leer.nextLine();
            if(frase.length() == 5 & frase.substring(0, 1).toUpperCase().equals("X") == true & frase.substring(4).toUpperCase().equals("O") == true){
                contadorCorrectas = contadorCorrectas + 1;
            }else if(frase.length() == 5 & frase.equals("&&&&&")){
                
            }else{
                contadorIncorrectas = contadorCorrectas + 1;
            }
        }while(frase.equals("&&&&&") == false);
     
        System.out.println("cantidad de frases correctas: " + contadorCorrectas);
        System.out.println("cantidad de frases incorrectas: " + contadorIncorrectas);
    }
    
}
