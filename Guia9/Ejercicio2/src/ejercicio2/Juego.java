/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author casad
 */
public class Juego {
    private ArrayList<Jugador> jugadores;
    private RevolverAgua revolver;

    public Juego(ArrayList<Jugador> jugadores, RevolverAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public Juego() {
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverAgua revolver) {
        this.revolver = revolver;
    }
    
    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverAgua revolver){
        this.jugadores = jugadores;
        this.revolver = revolver;
    }
    
    public boolean ronda(){
        boolean respuesta = false;
        for(Jugador recorrerJugadores : jugadores){
            if(recorrerJugadores.disaro(revolver) == true){
                System.out.println("El jugador: " + recorrerJugadores.getNombre() + " " + recorrerJugadores.getId() + " ha sido mojado");
                respuesta = true;
                break;
            }else if(respuesta == false){
                System.out.println("El jugador: " + recorrerJugadores.getNombre() + " " + recorrerJugadores.getId() + " no ha sido mojado");
            }
        }
        return respuesta;
    }
}
