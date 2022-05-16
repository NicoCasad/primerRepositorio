/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2extra;

import java.util.ArrayList;

/**
 *
 * @author casad
 */
public class Sala {
    private Asiento[][] asientos = new Asiento[8][6];
    private ArrayList<Espectador> espectadores = new ArrayList();
    
    public Sala() {
    }
    public Sala(Asiento[][] asientos, ArrayList<Espectador> espectadores){
        this.asientos = asientos;
        this.espectadores = espectadores;
    }

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
    }
    

    public void crearSala(){
        String letra = "";
        for (int i = 0; i < 6; i++) {
            int contador = 8;
            switch(i){
                case 0:
                    letra = "A";
                    break;
                case 1:
                    letra = "B";
                    break;
                case 2:
                    letra = "C";
                    break;
                case 3:
                    letra = "D";
                    break;
                case 4:
                    letra = "E";
                    break;
                case 5:
                    letra = "F";
                    break;
            }
            for(int recorrerFila = 0; recorrerFila < 8; recorrerFila++){
                Asiento nuevoAsiento = new Asiento();
                nuevoAsiento.setNumeroFila(contador);
                nuevoAsiento.setLetraColumna(letra);
                contador -= 1;
                asientos[recorrerFila][i] = nuevoAsiento;
            }
        }
    }
    public void asignarEspectadores(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                for (Espectador recEspectadores : espectadores) {
                    asientos[j][i].setEspectadorAsiento(recEspectadores);
                }
            }
        }
    }
    public void mostrarSala(){
        for (int i = 0; i < 6; i++) {
            
            System.out.println("");
                   
            for (int j = 0; j < 8; j++) {
                if(asientos[j][i].getEspectadorAsiento() == null){
                System.out.print(asientos[j][i].getNumeroFila() + asientos[j][i].getLetraColumna() + " |");
                }else{
                    System.out.print(asientos[j][i].getNumeroFila() + asientos[j][i].getLetraColumna() + "X|");
                }
            }
        }
    }
}
