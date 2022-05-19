/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;
import java.util.Scanner;
/**
 *
 * @author casad
 */
public class JavaApplication22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tamaño, unDig, dosDig, tresDig, cuatroDig, cincoDig, digitos, aux;
        unDig = 0;
        dosDig = 0;
        tresDig = 0;
        cuatroDig = 0;
        cincoDig = 0;
        cincoDig = 0;
        System.out.println("Ingrese el tamaño del vector");
        tamaño = leer.nextInt();
        
        int[] num = new int[tamaño];
        
        for(int i = 0; i < tamaño; i++){
            num[i] = (int) (Math.random()* 1000) + 1;
        }
        for(int j = 0; j < tamaño; j++){
            aux = num[j];
            digitos = 0;
            do{
               aux = aux / 10 - aux % 1;
               digitos = digitos + 1;
               
            }while(aux != 0);
            switch(digitos){
                case 1:
                    unDig = unDig + 1;
                    break;
                case 2: 
                    dosDig = dosDig + 1;
                    break;
                case 3: 
                    tresDig = tresDig + 1;
                    break;
                case 4: 
                    cuatroDig = cuatroDig + 1;
                    break;
                case 5: 
                    cincoDig = cincoDig + 1;
                    break;
            }
        }
        System.out.println("Un digito: " + unDig);
        System.out.println("Dos digitos: " + dosDig);
        System.out.println("Tres digitos: " + tresDig);
        System.out.println("Cuatro digitos: " + cuatroDig);
        System.out.println("Cinco digitos: " + cincoDig);
    }
}
