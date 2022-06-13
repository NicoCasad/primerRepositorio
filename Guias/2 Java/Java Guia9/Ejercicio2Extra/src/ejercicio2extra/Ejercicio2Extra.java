/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2extra;

import java.util.*;
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
        ArrayList<Espectador> espectadores = new ArrayList();
        Cine nCine = new Cine();
        
        Sala nSala = new Sala();
        nSala.crearSala();
        
        Pelicula nPelicula = new Pelicula();
        
        System.out.println("Ingrese nombre de la pelicula");
        nPelicula.setTitulo(leer.next());
        System.out.println("Ingrese el director de la Pelicula");
        nPelicula.setDirector(leer.next());
        System.out.println("Ingrese la edad minima para la pelicula");
        nPelicula.setEdad_minima(leer.nextInt());
        System.out.println("Ingrese la duracion en minutos de la pelicula");
        nPelicula.setDuracion(leer.nextInt());
        nCine.setPelicula(nPelicula);
        
        int cantEspectadores = new Random().nextInt(50);
        for(int i = 0; i < cantEspectadores; i++){
            if(i <= 48){
                Espectador nEspectador = new Espectador();
                nEspectador.crearEspectador();
                if(nEspectador.getDineroDisponible() < nCine.getPrecioEntrada()){
                    espectadores.add(nEspectador);
                }
            }else{
                System.out.println("La capacidad de la sala llego a su limite");
                break;
            }
        }
        nSala.setEspectadores(espectadores);
        nSala.asignarEspectadores();
        nSala.mostrarSala();
    }
    
}
