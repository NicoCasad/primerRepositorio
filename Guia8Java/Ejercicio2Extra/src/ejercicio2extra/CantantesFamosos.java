/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2extra;

import java.util.Scanner;
/**
 *
 * @author casad
 */
public class CantantesFamosos {
    Scanner leer = new Scanner(System.in);
    private String nombre, discoMasVentas;
    
    public CantantesFamosos(String nombre, String discoMasVentas) {
        this.nombre = nombre;
        this.discoMasVentas = discoMasVentas;
    }

    public CantantesFamosos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiscoMasVentas() {
        return discoMasVentas;
    }

    public void setDiscoMasVentas(String discoMasVentas) {
        this.discoMasVentas = discoMasVentas;
    }
    
    public void crearCantante(){
        System.out.println("Ingrese el nombre del cantante");
        nombre = leer.next();
        System.out.println("Ingrese el nombre del disco con mas ventas");
        discoMasVentas = leer.next();
    }

    @Override
    public String toString() {
        return "CantantesFamosos{" + "nombre=" + nombre + ", discoMasVentas=" + discoMasVentas + '}';
    }
    
}
