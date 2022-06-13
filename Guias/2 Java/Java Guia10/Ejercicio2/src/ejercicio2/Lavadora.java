/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author casad
 */
public class Lavadora extends Electrodomestico{
    private double carga;
    
    public Lavadora(double precio, double peso, String color, char consumoEnergetico, double carga) {
        super(precio, peso, color, consumoEnergetico);
        this.carga = carga;
    }

    public Lavadora() {
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(){
        crearElectrodomestico();
        System.out.println("Ingrese el peso de la carga");
        carga = leer.nextDouble();
    }
    
    @Override
    public double precioFinal(){
        super.precioFinal();
        if(carga > 30){
            precio += 500;
        }
        return precio;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }
    
}
