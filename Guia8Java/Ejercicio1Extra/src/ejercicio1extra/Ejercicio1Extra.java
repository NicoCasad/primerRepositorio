/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1extra;

import java.util.*;
/**
 *
 * @author casad
 */
public class Ejercicio1Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList();
        Integer suma = 0;
        int num;
        do{
            System.out.println("Ingrese un numero o ingrese -99 si quiere salir");
            num = leer.nextInt();
            if(num == -99){
                System.out.println("Calculando resultados...");
            }else{
                numeros.add(num);
            }
        }while(num != -99);
        
        System.out.println("La cantidad de numeros ingresados es de: " + numeros.size());
        for(Integer recorrerNumeros : numeros){
            suma += recorrerNumeros;
        }
        System.out.println("La suma de todos los numeros ingresados es de: " + suma);
        System.out.println("La media de los numeros ingresados es de: " + suma / (numeros.size()));
    }
    
}
