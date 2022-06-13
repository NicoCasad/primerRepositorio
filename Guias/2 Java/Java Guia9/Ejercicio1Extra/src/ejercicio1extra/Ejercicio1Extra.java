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
        String respuesta;
        ArrayList<Persona> personasAdoptivas = new ArrayList();
        ArrayList<Perro> perros = new ArrayList();
        do{
            System.out.println("Ingrese una persona");
            Persona nuevaPersona = new Persona();
            System.out.println("Ingrese el nombre de la persona");
            nuevaPersona.setNombre(leer.next());
            System.out.println("Ingrese la edad");
            nuevaPersona.setEdad(leer.nextInt());
            do{
                Perro nuevoPerro = new Perro();
                System.out.println("Ingrese el nombre de la mascota a adoptar");
                nuevoPerro.setNombre(leer.next());
                System.out.println("Ingrese la edad de la mascota a adoptar");
                nuevoPerro.setEdad(leer.nextInt());
                perros.add(nuevoPerro);
                System.out.println("Quiere adoptar una nueva mascota?");
                respuesta = leer.next();
            }while(respuesta.equals("si"));
            nuevaPersona.setMascotas(perros);
            nuevaPersona.setCantidadMascotas(perros.size());
            personasAdoptivas.add(nuevaPersona);
            System.out.println("Quiere ingresar una nueva persona?");
            respuesta = leer.next();
        }while(respuesta.equals("si"));
        
        System.out.println("Las personas con sus respectivas mascotas son:");
        for(Persona recPersona : personasAdoptivas){
            System.out.println(recPersona);
        }
    }
    
}
