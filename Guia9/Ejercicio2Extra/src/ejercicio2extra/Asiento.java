/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2extra;

/**
 *
 * @author casad
 */
public class Asiento {
    private int numeroFila;
    private String letraColumna;
    private Espectador espectadorAsiento;

    public Asiento(int numeroFila, String letraColumna) {
        this.numeroFila = numeroFila;
        this.letraColumna = letraColumna;
    }

    public Asiento() {
    }

    public int getNumeroFila() {
        return numeroFila;
    }

    public void setNumeroFila(int numeroFila) {
        this.numeroFila = numeroFila;
    }

    public String getLetraColumna() {
        return letraColumna;
    }

    public void setLetraColumna(String letraColumna) {
        this.letraColumna = letraColumna;
    }

    public Espectador getEspectadorAsiento() {
        return espectadorAsiento;
    }

    public void setEspectadorAsiento(Espectador espectadorAsiento) {
        this.espectadorAsiento = espectadorAsiento;
    }
    

    @Override
    public String toString() {
        return "Asiento{" + "numeroFila=" + numeroFila + ", letraColumna=" + letraColumna + ", espectadorAsiento=" + espectadorAsiento + '}';
    }
    
    
}
