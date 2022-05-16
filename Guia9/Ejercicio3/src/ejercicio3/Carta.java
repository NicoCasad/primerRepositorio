/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author casad
 */
public class Carta {
    private ArrayList<String> carta = new ArrayList();
    private int contador = 0;
    private Palo palo;
    private Numero num;
    Scanner leer = new Scanner(System.in);
    
    public Carta(ArrayList<String> carta, Palo palo, Numero num) {
        this.carta = carta;
        this.palo = palo;
        this.num = num;
    }

    public Carta() {
    }

    public ArrayList<String> getCarta() {
        return carta;
    }

    public void setCarta(ArrayList<String> carta) {
        this.carta = carta;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public Numero getNum() {
        return num;
    }

    public void setNum(Numero num) {
        this.num = num;
    }

    
    
    
    public void crearBaraja(){
        
        for(Palo auxi: Palo.values()){
            for(Numero aux: Numero.values()){
                carta.add(aux.toString() + " DE " + auxi.toString());
            }
        }
    }
    public void barajar(){
        Collections.shuffle(carta);
    }
    public String siguienteCarta(){
        return carta.get(contador);
    }
    public String cartasDisponibles(){
        int disponibles = carta.size() - contador;
        return "Quedan " + disponibles + " cartas en la baraja"; 
    }
    public void darCartas(){
        int repartir, disponibles = carta.size() - contador;
        System.out.println("Ingrese la cantidad de cartas a repartir");
        repartir = leer.nextInt();
        if(disponibles > repartir){
            for(int i = 0; i < repartir; i++){
                System.out.println(carta.get(i));
            }
            contador += repartir;
        }else{
            System.out.println("No quedan esa cantidad de cartas");
        }
    }
    public void cartasMonton(){
        if(contador == 0){
            System.out.println("No se ha repartido ninguna carta");
        }else{
            System.out.println("Las cartas repartidas son:");
            for(int i = 0; i < contador; i++){
                System.out.println(carta.get(i));
            }
        }
    }
    public void mostrarBaraja(){
        System.out.println("Las cartas en la baraja son:");
        for(int i = contador; i < carta.size(); i++){
                System.out.println(carta.get(i));
            }
    }
}
