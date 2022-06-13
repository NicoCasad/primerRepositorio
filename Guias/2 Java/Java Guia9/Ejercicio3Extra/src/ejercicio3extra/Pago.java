/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3extra;

import java.util.ArrayList;

/**
 *
 * @author casad
 */
public class Pago {
    private double montoTotal;
    private int cantCuotas;
    private boolean pago;
    private ArrayList<PagoCuota> cuotapago = new ArrayList();

    public Pago(double montoTotal, int cantCuotas, ArrayList<PagoCuota> cuotapago, boolean pago) {
        this.montoTotal = montoTotal;
        this.cantCuotas = cantCuotas;
        this.cuotapago = cuotapago;
        this.pago = pago;
    }

    public Pago() {
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public int getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public ArrayList<PagoCuota> getCuotapago() {
        return cuotapago;
    }

    public void setCuotapago(ArrayList<PagoCuota> cuotapago) {
        this.cuotapago = cuotapago;
    }

    @Override
    public String toString() {
        return "Pago{" + "montoTotal=" + montoTotal + ", cantCuotas=" + cantCuotas + ", cuotapago=" + cuotapago + '}';
    }
    
}
