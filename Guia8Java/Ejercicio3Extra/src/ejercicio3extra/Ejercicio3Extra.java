/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3extra;

import java.util.HashSet;
import java.util.Scanner;
/**
 *
 * @author casad
 */
public class Ejercicio3Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        HashSet<Libro> libreria = new HashSet();
        String respuesta;
        int opcion;
        do{
            Libro nuevoLibro = new Libro();
            
            System.out.println("Ingrese un libro");
            System.out.println("Ingrese el nombre del autor");
            nuevoLibro.setAutor(leer.next());
            System.out.println("Ingrese el titulo del libro");
            nuevoLibro.setTitulo(leer.next());
            System.out.println("Ingrese la cantidad de ejemplares");
            nuevoLibro.setNumEjemplares(leer.nextInt());
            libreria.add(nuevoLibro);
            do{
                System.out.println("Quiere ingresar un nuevo libro?");
                respuesta = leer.next();
            }while(respuesta.toLowerCase().equals("si")== false |  respuesta.toLowerCase().equals("no")== false);
        }while(respuesta != "no");
        do{
            System.out.println("Ingrese la opcion a realizar");
            System.out.println("1- solicitar prestamo");
            System.out.println("2- solicitar devolucion");
            System.out.println("3- mostrar libros");
            System.out.println("4- salir");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    String libro;
                    System.out.println("Ingrese el titulo del libro que quiere solicitar el prestamo");
                    libro = leer.next();
                    for(int i = 0; i < libreria.size(); i++){
                        if(libreria.get(i).getTitulo().equals(libro)){
                            
                        }
                    }
            }
        }while(opcion != 4);
    }
    
}
