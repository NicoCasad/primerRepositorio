/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3extra;

import java.util.*;
/**
 *
 * @author casad
 */
public class Libro {
    Scanner leer = new Scanner(System.in);
    private String titulo, autor;
    private int numEjemplares, numEjemplaresPrestados;

    public Libro(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }

    public Libro() {
    }
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public int getNumEjemplaresPrestados() {
        return numEjemplaresPrestados;
    }

    public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", numEjemplares=" + numEjemplares + ", numEjemplaresPrestados=" + numEjemplaresPrestados + '}';
    }
    
    public boolean prestamo(Libro nashe){
        if(nashe.getNumEjemplares() > nashe.getNumEjemplaresPrestados()){
            nashe.numEjemplaresPrestados += 1;
            return true;
        }else{
            System.out.println("no se encuentran ejemplares disponibles para prestar");
            return false;
        }
    }
    public boolean devolucion(Libro nashe){
        if(nashe.getNumEjemplares() > nashe.getNumEjemplaresPrestados()){
            nashe.numEjemplaresPrestados -= 1;
            return true;
        }else{
            System.out.println("no se encuentran ejemplares prestados");
            return false;
        }
    }
}
