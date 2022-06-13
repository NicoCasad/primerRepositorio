/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;
import java.util.Scanner;
/**
 *
 * @author casad
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int aux, numeroLado;
        
        
        System.out.println("Ingrese numero de lado");
        numeroLado = leer.nextInt();
        
        for(int i = 0; i < numeroLado; i++){
            aux =  0;
            if(i == 0 | i == numeroLado - 1){
                do{
                    System.out.print("* ");
                    aux = aux + 1;
                }while(aux < numeroLado);
                System.out.println("");
                
            }            
            for(int j = 0; j < numeroLado; j++){
                if(i != 0 & i != numeroLado - 1 & j == 0 & j == numeroLado - 1){
                    System.out.print("* ");
                }else if(i != 0 & i != numeroLado - 1 & j != 0 & j != numeroLado - 1){
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
    
}
