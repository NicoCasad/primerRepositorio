/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author casad
 */
public class Pelicula {
    private String autor, titulo;
    private Integer duracion;
    Scanner leer = new Scanner(System.in);
    //Comparadores
    public static Comparator<Pelicula> compararAutor = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p2.getAutor().compareTo(p1.getAutor());
        }
    };
    
    public static Comparator<Pelicula> compararTitulo = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p2.getTitulo().compareTo(p1.getTitulo());
        }
    };
    
    public static Comparator<Pelicula> compararDuracionMayorMenor = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o2.getDuracion().compareTo(o1.getDuracion());
        }   
    };
    
        public static Comparator<Pelicula> compararDuracionMenorMayor = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDuracion().compareTo(o2.getDuracion());
        }   
    };
        
    @Override
    public String toString()
    {
        return "Título: " + this.titulo + ", de " + this.autor + ", duracion: " + this.duracion + " minutos";
    }
        
    //Controladores    
    public Pelicula(String autor, String titulo, Integer duracion) {
        this.autor = autor;
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public Pelicula() {
    }
    
    
    // Getters y Setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }
    
    
    //Metodos
    public void crearPelicula(){
        System.out.println("Ingrese una nueva pelicula");
        System.out.println("Nombre de autor:");
        autor = leer.next();
        System.out.println("Titulo de la pelicula:");
        titulo = leer.next();
        System.out.println("Duracion de la pelicula en minutos:");
        duracion = leer.nextInt();
    }
    public void mostrarPeliculas(ArrayList<Pelicula> pelis){
        System.out.println("Las peliculas en cartelera son: ");
        for(Pelicula pelispedia : pelis){
            System.out.println(pelispedia);
        }
    }
    public void duracionMasDeLaHora(ArrayList<Pelicula> pelis){
        System.out.println("Las peliculas en cartelera con mas de 1 hora de duracion son: ");
        for(Pelicula pelispedia : pelis){
            if(pelispedia.getDuracion() > 60){
                System.out.println(pelispedia);
            }
        }
    }
    public void ordenarXAutor(ArrayList<Pelicula> pelis){
        Collections.sort(pelis, compararAutor);
        for(Pelicula plispedia : pelis){
            System.out.println(plispedia);
        }
    }
    public void ordenarXTitulo(ArrayList<Pelicula> pelis){
        Collections.sort(pelis, compararTitulo);
        for(Pelicula plispedia : pelis){
            System.out.println(plispedia);
        }
    }
    public void ordenarXDuracionMayorMenor(ArrayList<Pelicula> pelis){
        Collections.sort(pelis, compararDuracionMayorMenor);
        for(Pelicula plispedia : pelis){
            System.out.println(plispedia);
        }
    }
    public void ordenarXDuracionMenorMayor(ArrayList<Pelicula> pelis){
        Collections.sort(pelis, compararDuracionMenorMayor);
        for(Pelicula plispedia : pelis){
            System.out.println(plispedia);
        }
    }
}
