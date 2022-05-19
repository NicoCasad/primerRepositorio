/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;
import java.util.*;
/**
 *
 * @author casad
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carta nuevaBaraja = new Carta();
        Scanner leer = new Scanner(System.in);
        int opcion;
        
        nuevaBaraja.crearBaraja();
        nuevaBaraja.barajar();
        
        do{
            System.out.println("Ingrese la opcion a realizar");
            System.out.println("1- barajar");
            System.out.println("2- mostrar siguiente carta");
            System.out.println("3- mostrar cantidad de cartas que quedan en la baraja");
            System.out.println("4- repartir cartas");
            System.out.println("5- mostrar las cartas que quedan en el maso");
            System.out.println("6- mostrar cartas que ya se repartieron");
            System.out.println("7- salir");
            
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    nuevaBaraja.barajar();
                    break;
                case 2:
                    System.out.println(nuevaBaraja.siguienteCarta());
                    break;
                case 3:
                    System.out.println(nuevaBaraja.cartasDisponibles());
                    break;
                case 4:
                    nuevaBaraja.darCartas();
                    break;
                case 5:
                    nuevaBaraja.mostrarBaraja();
                    break;
                case 6: 
                    nuevaBaraja.cartasMonton();
                    break;
                case 7:
                    break;
                default:
                    break;
            }
        }while(opcion != 7);
    }
    
}
