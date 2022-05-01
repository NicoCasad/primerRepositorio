/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionvendedoresclientes;
import java.util.Scanner;
/**
 *
 * @author casad
 */
public class Cliente {
    Scanner leer = new Scanner(System.in);
    private String nombre;
    private int dni, edad, numeroTelefono;
    
    public Cliente(){
        
    }
    public Cliente(String nombre, int dni, int edad, int numeroTelefono){
        this.dni = dni;
        this.edad = edad;
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    public void crearCliente(){
        dni = leer.nextInt();
        numeroTelefono = leer.nextInt();
        nombre = leer.nextLine();
        edad = leer.nextInt();
    }
}
