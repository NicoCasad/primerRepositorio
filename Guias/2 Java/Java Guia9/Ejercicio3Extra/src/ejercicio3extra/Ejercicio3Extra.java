/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3extra;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author casad
 */
public class Ejercicio3Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String respuesta;
        ArrayList<PagoCuota> nPagoCuotas = new ArrayList();
        ArrayList<Poliza> polizas = new ArrayList();
        Scanner leer = new Scanner(System.in);
        do{
            Poliza nPoliza = new Poliza();
            Cliente nCliente = new Cliente();
            Vehiculo nVehiculo = new Vehiculo();
            Pago nPago = new Pago();
            nPoliza.setnCliente(nCliente);
            nPoliza.setnVehiculo(nVehiculo);
            nPoliza.setnPago(nPago);
            for (int i = 0; i < nPoliza.getCantCuotas(); i++) {
                PagoCuota nPagoCuota = new PagoCuota();
                nPagoCuotas.add(nPagoCuota);
            }  
            nPago.setCuotapago(nPagoCuotas);
            polizas.add(nPoliza);
            System.out.println("Quiere crear una nueva poliza?");
            respuesta = leer.next();
        }while(respuesta.equals("si"));
    }
    
}
