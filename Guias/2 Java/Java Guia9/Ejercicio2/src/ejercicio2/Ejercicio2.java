/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.ArrayList;
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
        RevolverAgua revolver = new RevolverAgua();
        ArrayList<Jugador> jugadores = new ArrayList();
        Juego nuevoJuego = new Juego();
        Scanner leer = new Scanner(System.in);
        boolean respuesta;
        int cantJug;
        
        System.out.println("Ingrese la canidad de jugadores");
        cantJug = leer.nextInt();
        
        if(cantJug > 6 ){
            cantJug = 6;
        }else if(cantJug < 2){
            cantJug = 2;
        }
        
        for(int i = 1; i < cantJug + 1; i++){
            Jugador jugadorcin = new Jugador();
             System.out.println("Ingrese nombre de jugador: " + i);
             jugadorcin.setNombre(leer.next());
             jugadorcin.setId(i);
             jugadores.add(jugadorcin);
        }
        revolver.llenarRevolver();

        nuevoJuego.setJugadores(jugadores);
        nuevoJuego.setRevolver(revolver);
        nuevoJuego.ronda();    
    }
    
}
