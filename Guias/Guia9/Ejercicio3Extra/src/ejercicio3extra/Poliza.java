/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3extra;

import java.util.Date;
/**
 *
 * @author casad
 */
public class Poliza {
    private int numPoliza, cantCuotas;
    private double montoTotalAsegurado, montoMaxGranizo;
    private boolean incluyeGranizo;
    private Date fInicio, fFin;
    private Cliente nCliente;
    private Vehiculo nVehiculo;
    private Pago nPago;

    public Poliza(int numPoliza, int cantCuotas, double montoTotalAsegurado, double montoMaxGranizo, boolean incluyeGranizo, Date fInicio, Date fFin, Cliente nCliente, Vehiculo nVehiculo, Pago nPago) {
        this.numPoliza = numPoliza;
        this.cantCuotas = cantCuotas;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.montoMaxGranizo = montoMaxGranizo;
        this.incluyeGranizo = incluyeGranizo;
        this.fInicio = fInicio;
        this.fFin = fFin;
        this.nCliente = nCliente;
        this.nVehiculo = nVehiculo;
        this.nPago = nPago;
    }

    public Poliza() {
    }

    public int getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(int numPoliza) {
        this.numPoliza = numPoliza;
    }

    public int getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public double getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(double montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public double getMontoMaxGranizo() {
        return montoMaxGranizo;
    }

    public void setMontoMaxGranizo(double montoMaxGranizo) {
        this.montoMaxGranizo = montoMaxGranizo;
    }

    public boolean isIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public Date getfInicio() {
        return fInicio;
    }

    public void setfInicio(Date fInicio) {
        this.fInicio = fInicio;
    }

    public Date getfFin() {
        return fFin;
    }

    public void setfFin(Date fFin) {
        this.fFin = fFin;
    }

    public Cliente getnCliente() {
        return nCliente;
    }

    public void setnCliente(Cliente nCliente) {
        this.nCliente = nCliente;
    }

    public Vehiculo getnVehiculo() {
        return nVehiculo;
    }

    public void setnVehiculo(Vehiculo nVehiculo) {
        this.nVehiculo = nVehiculo;
    }

    public Pago getnPago() {
        return nPago;
    }

    public void setnPago(Pago nPago) {
        this.nPago = nPago;
    }

    @Override
    public String toString() {
        return "Poliza{" + "numPoliza=" + numPoliza + ", cantCuotas=" + cantCuotas + ", montoTotalAsegurado=" + montoTotalAsegurado + ", montoMaxGranizo=" + montoMaxGranizo + ", incluyeGranizo=" + incluyeGranizo + ", fInicio=" + fInicio + ", fFin=" + fFin + ", nCliente=" + nCliente + ", nVehiculo=" + nVehiculo + ", nPago=" + nPago + '}';
    }
    
    
}
