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
public class RevolverAgua {
    private double posicionActual, posicionReal;

    public RevolverAgua(int posicionActual, int posicionReal) {
        this.posicionActual = posicionActual;
        this.posicionReal = posicionReal;
    }

    public RevolverAgua() {
    }

    public double getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public double getPosicionReal() {
        return posicionReal;
    }

    public void setPosicionReal(int posicionReal) {
        this.posicionReal = posicionReal;
    }
    
    public void llenarRevolver(){
        double auxiliar;
        do{
            posicionActual = (Math.random() * 10) + 1;
            auxiliar = posicionActual % 1;
            posicionActual -= auxiliar;
        }while(posicionActual > 6);
        do{
            posicionReal = (Math.random() * 10) + 1;
            auxiliar = posicionReal % 1;
            posicionReal -= auxiliar;
        }while(posicionReal > 6);
    }
    public boolean mojar(){
        if(posicionReal == posicionActual){
            return true;
        }else{
            return false;
        }
    }
    public void siguienteChorro(){
        if(posicionActual < 6){
            posicionActual += 1;
        }else{
            posicionActual = 1;
        }
    }

    @Override
    public String toString() {
        return "RevolverAgua{" + "posicionActual=" + posicionActual + ", posicionReal=" + posicionReal + '}';
    }
    
}
