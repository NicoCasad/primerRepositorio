/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionvendedoresclientes;

/**
 *
 * @author casad
 */
public class Vendedor {
    private int dni, numTelefono, edad;
    private String nombre;
    
    public Vendedor(){
        
    }

    public Vendedor(int numTelefono, int edad, String nombre) {
        this.numTelefono = numTelefono;
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void crearVendedor(){
        
    }
}
