/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author casad
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> perros = new ArrayList();
        String perro, opcion;
        opcion = "si";
        perro = "";
        Scanner leer = new Scanner(System.in);
        int contador = 0;
        while (opcion.equals("si")== true){
            if(contador > 0){
                System.out.println("Quiere ingresar una nueva raza?");
                opcion = leer.next();
                if(opcion.toLowerCase().equals("si") == true){
                    System.out.println("Ingrese una nueva raza");
                    perro = leer.next();
                    perros.add(perro);
                }
            }else{
                System.out.println("Ingrese un perro");
                perro = leer.nextLine();
                contador += 1;
                perros.add(perro);
            }
        }
        System.out.println("Las razas de perro ingresadas son");
        for(String recorrerPerros : perros){
            System.out.println(recorrerPerros);
        }
    }
    
}
