/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2extra;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**
 *
 * @author casad
 */
public class Ejercicio2Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        ArrayList<CantantesFamosos> cantantes = new ArrayList();
        do{
            CantantesFamosos nuevoCantante = new CantantesFamosos();
            nuevoCantante.crearCantante();
            cantantes.add(nuevoCantante);
        }while(cantantes.size() != 5);
        do{
            System.out.println("Inngrese el numero de la operacion que quiere realizar");
            System.out.println("1- Agregar cantante");
            System.out.println("2- Mostrar cantantes");
            System.out.println("3- Eliminar cantante");
            System.out.println("4- salir");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1: 
                    CantantesFamosos nuevoCantante = new CantantesFamosos();
                    nuevoCantante.crearCantante();
                    cantantes.add(nuevoCantante);
                    break;
     
                case 2:
                    for(CantantesFamosos recCantantes : cantantes){
                        System.out.println(recCantantes);
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el cantante a eliminar");
                    String cantanteEliminar = leer.next();
                    for(int recorrerCantantes = 0; recorrerCantantes < cantantes.size(); recorrerCantantes++){
                        if (cantantes.get(recorrerCantantes).getNombre().equals(cantanteEliminar)){
                            cantantes.remove(cantantes.get(recorrerCantantes));
                        }
                    }
                    break;
                case 4:
                    break;
                    
                default:
                    System.out.println("Ingrese una de las opciones");
                    break;
            }
        }while(opcion != 4);
        System.out.println("Los Cantantes famosos que quedaron son:");
        for(CantantesFamosos recCantantes : cantantes){
            System.out.println(cantantes);
        }
    }   

    
}
