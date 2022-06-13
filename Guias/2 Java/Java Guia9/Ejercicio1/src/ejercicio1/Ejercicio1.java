/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import java.util.*;
/**
 *
 * @author casad
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("-----------------------------Persona------------------------------");
        
        Persona nuevaPersona = new Persona();
        System.out.println("Ingrese el nombre de la persona que va a adoptar");
        nuevaPersona.setNombre(leer.next());
        System.out.println("Ingrese el apellido de la persona");
        nuevaPersona.setApellido(leer.next());
        System.out.println("Ingrese el dni de la persona");
        nuevaPersona.setDni(leer.nextInt());
        System.out.println("Ingrese la edad de la persona");
        nuevaPersona.setEdad(leer.nextInt());
        
        System.out.println("-----------------------------Mascota------------------------------");
        
        Perro nuevoPerro = new Perro();
        System.out.println("Ingrese el nombre del perro que se va a adoptar");
        nuevoPerro.setNombre(leer.next());
        System.out.println("Ingrese la raza del perro");
        nuevoPerro.setRaza(leer.next());
        System.out.println("Ingrese la edad del perro");
        nuevoPerro.setEdad(leer.nextInt());
        System.out.println("Ingrese el tamano del perro en cm");
        nuevoPerro.setTamano(leer.nextInt());
        
        nuevaPersona.setPerro(nuevoPerro);
        System.out.println(nuevaPersona);
    }
    
}
