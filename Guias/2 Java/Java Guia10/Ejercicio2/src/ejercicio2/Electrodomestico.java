/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;
/**
 *
 * @author casad
 */
public class Electrodomestico {
    protected double precio, peso;
    protected String color;
    protected char consumoEnergetico;
    Scanner leer = new Scanner(System.in);

    public Electrodomestico(double precio, double peso, String color, char consumoEnergetico) {
        this.precio = precio;
        precio = 1000;
        this.peso = peso;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
    }

    public Electrodomestico() {
        precio = 1000;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }
    
    protected void comprobarConsumoEnergetico(char letra){
     switch(letra){
         case 'A': consumoEnergetico = letra;
                break;
         case 'B': consumoEnergetico = letra;
                break;
         case 'C': consumoEnergetico = letra;
                break;
         case 'D': consumoEnergetico = letra;
                break;
         case 'E': consumoEnergetico = letra;
                break;
         case 'F': consumoEnergetico = letra;
                break;
         default: consumoEnergetico = 'F';
                break;
     }
    }
    protected void comprobarColor(String color){
        switch(color.toLowerCase()){
         case "blanco": this.color = color;
                break;
         case "negro": this.color = color;
                break;
         case "rojo": this.color = color;
                break;
         case "azul": this.color = color;
                break;
         case "gris": this.color = color;
                break;
         default: color = "blanco";
                break;
     }
    }
    protected void crearElectrodomestico(){
        System.out.println("Ingrese consumo energetico(A, B, C, D, E, F)");
        consumoEnergetico = leer.next().charAt(0);
        System.out.println("Ingrese color de electrodomestico(blanco, negro, rojo, azul, gris)");
        color = leer.next();
        System.out.println("Ingrese el peso del electrodomestico");
        peso = leer.nextDouble();
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);    
    }
    protected double precioFinal(){
        precio = 1000;
        switch(consumoEnergetico){
         case 'A': precio += 1000;
                break;
         case 'B': precio += 800;
                break;
         case 'C': precio += 600;
                break;
         case 'D': precio += 500;
                break;
         case 'E': precio += 300;
                break;
         case 'F': precio += 100;
                break;
        }
        if(peso < 20){
            precio += 100;
        }else if(peso < 50){
            precio += 500;
        }else if(peso < 80){
            precio += 800;
        }else if(peso > 79){
            precio += 1000;
        }
        return precio;
    }
}
