/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author casad
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> perros = new ArrayList();
        String perro, opcion;
        
        opcion = "si";
        perro = "";
        Scanner leer = new Scanner(System.in);
        int contador = 0;
        while (opcion.equals("si")== true){
            if(contador > 0){
                System.out.println("Quiere ingresar una nueva raza?");
                opcion = leer.next();
                if(opcion.toLowerCase().equals("si") == true){
                    System.out.println("Ingrese una nueva raza");
                    perro = leer.next();
                    perros.add(perro);
                }
            }else{
                System.out.println("Ingrese un perro");
                perro = leer.nextLine();
                contador += 1;
                perros.add(perro);
            }
        }

        Iterator iterator = perros.iterator();
        System.out.println("Las razas encontradas son: ");
        while(iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
        System.out.println("Ingrese la raza a quitar de la lista");
        String razaEliminar = leer.next();
        perros.remove(razaEliminar);
        System.out.println("Las razas encontradas son: ");
        Iterator iterador = perros.iterator();
        while(iterador.hasNext()){
            System.out.println(iterador.next() + " ");
        }
    }
    
}