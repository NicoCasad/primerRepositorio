/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;
import java.util.Scanner;
/**
 *
 * @author casad
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        
        for(int i = 0;i <= 20; i++){
            System.out.println("Ingrese un numero");
            numero = leer.nextInt();
            if(numero == 0){
                break;
            }
        }
    }
    
}
