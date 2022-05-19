/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;
import java.util.Scanner;
/**
 *
 * @author casad
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion, numero1, numero2;
        float resultado;
        String letra;
        
        letra = "N";

        
        //MENU
        do{
            System.out.println("Ingrese dos numeros");
            numero1 = leer.nextInt();
            numero2 = leer.nextInt();
            
            System.out.println("1- sumar");
            System.out.println("2- restar");
            System.out.println("3- multiplicar");
            System.out.println("4- dividir");
            System.out.println("5- salir");
            System.out.println("Ingrese una opcion ");
            
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1: 
                    resultado = numero1 +  numero2;
                    System.out.println(resultado);
                    continue;
                case 2:
                    resultado  = numero1- numero2;
                    System.out.println(resultado);
                    continue;
                case 3: 
                    resultado = numero1 * numero2;
                    System.out.println(resultado);
                    continue;
                case 4:
                    resultado = numero1 / numero2;
                    System.out.println(resultado);
                    continue;
                case 5:
                    System.out.println("Seguroque quiere salir? S/N");
                    letra = leer.nextLine();
                    if(letra.toUpperCase().equals("S")){
                        break;
                    }
            }
        }while(letra.toUpperCase().equals("S") == false & opcion < 1 | opcion > 5 );
    }
    
}
