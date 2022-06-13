/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author casad
 */
public class Alumno {
    Scanner leer = new Scanner(System.in);
    private String nombre;
    ArrayList<Integer> notas = new ArrayList();

    public Alumno(String nombre, ArrayList notas) {
        this.nombre = nombre;
        this.notas = notas;
    }
    public Alumno(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList getNotas(){
        return notas;
    }
    public void setNotas(ArrayList notas){
        this.notas = notas;
    }
    public void crearAlumno(){
        System.out.println("Ingrese el nombre del alumno");
        nombre = leer.next();
        System.out.println("Ingrese la primer nota");
        notas.add(leer.nextInt());
        System.out.println("Ingrese la segunda nota");
        notas.add(leer.nextInt());
        System.out.println("Ingrese la tercer nota");
        notas.add(leer.nextInt());
    }
    public int notaFinal(Alumno alumno){
        int nota = 0;
        for(Integer notasF : alumno.notas){
            nota += notasF;
        }
        nota = nota / 3;
        return nota;
    }
}
