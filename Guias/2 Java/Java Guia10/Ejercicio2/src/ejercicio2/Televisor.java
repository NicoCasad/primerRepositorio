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
public class Televisor extends Electrodomestico {
    private int resolucion;
    private boolean sincronizadorTDT;

    public Televisor(int resolucion, boolean sincronizadorTDT, double precio, double peso, String color, char consumoEnergetico) {
        super(precio, peso, color, consumoEnergetico);
        this.resolucion = resolucion;
        this.sincronizadorTDT = sincronizadorTDT;
    }

    public Televisor() {
        
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSincronizadorTDT() {
        return sincronizadorTDT;
    }

    public void setSincronizadorTDT(boolean sincronizadorTDT) {
        this.sincronizadorTDT = sincronizadorTDT;
    }
    
    public void crearTelevisor(){
        String resp;
        crearElectrodomestico();
        System.out.println("Ingrese las pulgadas del televisor");
        resolucion = leer.nextInt();
        System.out.println("Tiene sincronizador TDT?");
        resp = leer.next();
        if(resp.toLowerCase().equals("si")){
            sincronizadorTDT = true;
        }else{
            sincronizadorTDT = false;
        }
    }
    
    @Override
    public double precioFinal(){
        super.precioFinal();
        if(resolucion > 40){
            precio += (precio * 30) / 100;
        }
        if(sincronizadorTDT == true){
            precio += 500;
        }
        return precio;
    }

    @Override
    public String toString() {
        return "Televisor{" + "resolucion=" + resolucion + ", sincronizadorTDT=" + sincronizadorTDT + '}';
    }
    
}
