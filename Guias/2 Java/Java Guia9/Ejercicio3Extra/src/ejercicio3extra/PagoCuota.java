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
public class PagoCuota {
    private double monto;
    private int codigoCuota;
    private String metodoPago;

    public PagoCuota(double monto, int codigoCuota, String metodoPago) {
        this.monto = monto;
        this.codigoCuota = codigoCuota;
        this.metodoPago = metodoPago;
    }

    public PagoCuota() {
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getCodigoCuota() {
        return codigoCuota;
    }

    public void setCodigoCuota(int codigoCuota) {
        this.codigoCuota = codigoCuota;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    @Override
    public String toString() {
        return "PagoCuota{" + "monto=" + monto + ", codigoCuota=" + codigoCuota + ", metodoPago=" + metodoPago + '}';
    }
    
    
}
