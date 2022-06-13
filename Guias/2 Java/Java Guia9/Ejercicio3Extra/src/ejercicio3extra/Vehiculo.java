/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3extra;

/**
 *
 * @author casad
 */
public class Vehiculo {
    private String marca, modelo, chasis, color;
    private int ano, numMotor;

    public Vehiculo(String marca, String modelo, String chasis, String color, int ano, int numMotor) {
        this.marca = marca;
        this.modelo = modelo;
        this.chasis = chasis;
        this.color = color;
        this.ano = ano;
        this.numMotor = numMotor;
    }

    public Vehiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", chasis=" + chasis + ", color=" + color + ", ano=" + ano + ", numMotor=" + numMotor + '}';
    }
    
    
}
