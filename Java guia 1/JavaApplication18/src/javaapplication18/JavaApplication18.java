/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;
import java.util.Scanner;
/**
 *
 * @author casad
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        for(int i = 0; i < 4; i++){
            do{
              System.out.println("Ingrese un numero entr 1 y 20"); 
              num = leer.nextInt();
            }while(num < 0 | num > 21);
            System.out.print(num);
            for(int j = 0; j < num; j++){
                System.out.print(" *");
                
            }
            System.out.println("");
        } 
    }    
}
