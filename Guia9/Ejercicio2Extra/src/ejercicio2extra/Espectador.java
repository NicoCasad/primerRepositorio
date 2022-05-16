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
public class Espectador {
    private String nombre;
    private double edad, dineroDisponible;
    Scanner leer = new Scanner(System.in);
    
    public Espectador(String nombre, double edad, double dineroDisponible) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisponible = dineroDisponible;
    }

    public Espectador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public double getDineroDisponible() {
        return dineroDisponible;
    }

    public void setDineroDisponible(double dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dineroDisponible=" + dineroDisponible + '}';
    }
    
    public void crearEspectador(){
        nombre = randomName().toString();
        do{
            edad = new Random().nextInt(80);
        }while(edad < 10);
        do{
            dineroDisponible = new Random().nextInt(1000);
        }while(dineroDisponible > 200);
    }
    private PersonasNombre randomName(){
        int aux = new Random().nextInt(PersonasNombre.values().length);
        return PersonasNombre.values()[aux];
    }
}
