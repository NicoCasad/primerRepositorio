/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;
import java.util.Scanner;
/**
 *
 * @author casad
 */
public class JavaApplication11 {

    public static void tiposDeBomba(int opcion, Scanner leer){  
        System.out.println("Ingrese el tipo de bomba");
        opcion = leer.nextInt();
        
        if(opcion < 5 & opcion > 0){
            switch(opcion){
                case 1:
                    System.out.println("Es una bomba de agua");
                    break;
                case 2:
                    System.out.println("Es una bomba de gasolina");
                    break;
                case 3:
                    System.out.println("es una bomba de hormigon");
                    break;
                case 4:
                    System.out.println("Es una bomba de pasta alimenticia"); 
                    break;
            }
        }else{
            System.out.println("No existe un valor valido para tipo de bomba");
            tiposDeBomba(opcion, leer);
        }
    }
    public static boolean tiposDeBomba2(int opcion, Scanner leer){  
        System.out.println("Ingrese el tipo de bomba");
        opcion = leer.nextInt();
        
        if(opcion < 5 & opcion > 0){
            switch(opcion){
                case 1:
                    System.out.println("Es una bomba de agua");
                    break;
                case 2:
                    System.out.println("Es una bomba de gasolina");
                    break;
                case 3:
                    System.out.println("es una bomba de hormigon");
                    break;
                case 4:
                    System.out.println("Es una bomba de pasta alimenticia"); 
                    break;
            }
            return true;
        }else{
            System.out.println("No existe un valor valido para tipo de bomba");
            return false;
        }
        
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        opcion = 0;
        
        do{
        System.out.println("Ingrese el tipo de bomba");
        opcion = leer.nextInt();
        
            switch(opcion){
                    case 1:
                        System.out.println("Es una bomba de agua");
                        break;
                    case 2:
                        System.out.println("Es una bomba de gasolina");
                        break;
                    case 3:
                        System.out.println("es una bomba de hormigon");
                        break;
                    case 4:
                        System.out.println("Es una bomba de pasta alimenticia"); 
                        break;
            }
        }while(opcion < 0 | opcion > 10);
            
        
    }
}
