/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;
import java.util.Scanner;
/**
 *
 * @author casad
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero, buscarNum, auxiliar;
        auxiliar = 0;
         
        System.out.println("Ingrese el tamaño del vector");
        numero = leer.nextInt();
        
        int[] num = new int[numero];
        
        for(int i = 0; i < numero; i++){
            num[i] = (int) Math.random()* 10;
        }
        System.out.println("Ingrese el numero a buscar");
        buscarNum = leer.nextInt();
        for(int j = 0; j < numero; j++){
            if(num[j] == buscarNum){
                auxiliar = auxiliar + 1;
            }
        }
        System.out.println("Se encontraron " + auxiliar + " coincidencias");
    }
    
}
