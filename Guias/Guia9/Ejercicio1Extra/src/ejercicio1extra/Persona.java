/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1extra;

import java.util.*;
/**
 *
 * @author casad
 */
public class Persona {
    private String nombre;
    private int edad, cantidadMascotas;
    private ArrayList<Perro> mascotas = new ArrayList();

    public Persona(String nombre, int edad, int cantidadMascotas) {
        this.nombre = nombre;
        this.edad = edad;
        this.cantidadMascotas = cantidadMascotas;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantidadMascotas() {
        return cantidadMascotas;
    }

    public void setCantidadMascotas(int cantidadMascotas) {
        this.cantidadMascotas = cantidadMascotas;
    }

    public ArrayList<Perro> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Perro> mascotas) {
        this.mascotas = mascotas;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", cantidadMascotas=" + cantidadMascotas + ", mascotas=" + mascotas + '}';
    }
    
}
