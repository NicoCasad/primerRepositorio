/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author casad
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList();
        //Alumno alumno = new Alumno();
        Scanner leer = new Scanner(System.in);
        String respuesta;
        String nombreAlumno;
        int contador = 0;
        
        do{
           Alumno alumno = new Alumno();
           alumno.crearAlumno();
           alumnos.add(alumno);
           do{
           System.out.println("¿Quiere ingresar un nuevo alumno?(si/no)");    
           respuesta = leer.next();
           }while(respuesta.toLowerCase().equals("si") == false & respuesta.toLowerCase().equals("no") == false);
        }while (respuesta.toLowerCase().equals("si"));
        
        System.out.println("Los alumnos con sus respectivas notas son:");
        
        for(Alumno mostrarAlumnos : alumnos){
            System.out.println(mostrarAlumnos.getNombre());
            System.out.println(mostrarAlumnos.getNotas());
        }
        do{
           System.out.println("¿Quiere saber la nota final de algun alumno(si/no)");    
           respuesta = leer.next();
        }while(respuesta.toLowerCase().equals("si") == true & respuesta.toLowerCase().equals("no") == true);
        if(respuesta.equals("si")){
            do{
                System.out.println("Ingrese el nombre del alumno que requiere ver la nota final");
                nombreAlumno = leer.next();
                for(Alumno recorrerAlumnos : alumnos){
                    if(recorrerAlumnos.getNombre().toLowerCase().equals(nombreAlumno.toLowerCase())){
                        System.out.println(recorrerAlumnos.notaFinal(recorrerAlumnos));
                        contador = 1;
                    }
                    //else{
                    //    System.out.println("No se encontro el alumno");
                    //}    
                }
            }while(contador == 0);
        }
    }
}
