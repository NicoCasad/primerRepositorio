/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author casad
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String respuesta, pais, paisEliminar;
        
        Scanner leer = new Scanner(System.in);
        TreeSet<String> paises = new TreeSet();
        
        do{
            System.out.println("Ingrese el pais a agregar");
            pais = leer.next();
            paises.add(pais);
            System.out.println("Quiere ingresar un nuevo pais?");
            respuesta = leer.next();
        }while(respuesta.toLowerCase().equals("si"));
        
        System.out.println("Los paises ingresados son");
        for(String recorrerPaises : paises){
            System.out.println(recorrerPaises);
        }
        System.out.println("Ingrese el pais a eliminar");
        paisEliminar = leer.next();
        int contador = 0;
        Iterator iterator = paises.iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals(paisEliminar)){
                paises.remove(paisEliminar);
                contador = 1;
            }
        }
        if(contador == 0){
            System.out.println("No se encontro el pais a eliminar");
        }
        System.out.println("Los paises restantes son:");
        paises.forEach((recorrerPaises) -> {
            System.out.println(recorrerPaises);
        });
    }
}
