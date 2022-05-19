/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author casad
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Pelicula> peliculas = new ArrayList();
        String respuesta;
        
        do{          
            Pelicula peli = new Pelicula();
            peli.crearPelicula();
            peliculas.add(peli);
            
            System.out.println("Quiere agregar una nueva pelicula?(si / no)");
            respuesta = leer.next();
            
            if(respuesta.equals("no")){
                System.out.println("Mostrando peliculas cargadas");
                peli.mostrarPeliculas(peliculas);
                System.out.println("ordenadas por autor alfabeticamente");
                peli.ordenarXAutor(peliculas);
                System.out.println("Ordenadas por titulo alfabeticamente");
                peli.ordenarXTitulo(peliculas);
                System.out.println("Con duracion mayor a 1 hora");
                peli.duracionMasDeLaHora(peliculas);
                System.out.println("Ordenadas por duracion descendente");
                peli.ordenarXDuracionMayorMenor(peliculas);
                System.out.println("Ordenadas por duracion ascendente");
                peli.ordenarXDuracionMenorMayor(peliculas);
                
            }
        }while(respuesta.toLowerCase().equals("si"));
    }
    
}
