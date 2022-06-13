/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author casad
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        double precioElectrodomesticos, pLavadoras, pTelevisores;
        
        
        Televisor nTelevisor = new Televisor();
        nTelevisor.crearTelevisor();
        System.out.println(nTelevisor.precioFinal());
        electrodomesticos.add(nTelevisor);
        precioElectrodomesticos = nTelevisor.precio;
        pTelevisores = nTelevisor.precio;
        
        Televisor nuTelevisor = new Televisor();
        nuTelevisor.crearTelevisor();
        System.out.println(nuTelevisor.precioFinal());
        electrodomesticos.add(nuTelevisor);
        precioElectrodomesticos += nuTelevisor.precio;
        pTelevisores += nuTelevisor.precio;
        
        Lavadora nLavadora = new Lavadora();
        nLavadora.crearLavadora();
        System.out.println(nLavadora.precioFinal());
        electrodomesticos.add(nLavadora);
        precioElectrodomesticos += nLavadora.precio;
        pLavadoras = nLavadora.precio;
        
        Lavadora nuLavadora = new Lavadora();
        nuLavadora.crearLavadora();
        System.out.println(nuLavadora.precioFinal());
        electrodomesticos.add(nuLavadora);
        precioElectrodomesticos += nuLavadora.precio;
        pLavadoras += nuLavadora.precio;
        
        for (Electrodomestico electrodomestico : electrodomesticos) {
            System.out.println(electrodomestico);
        }
        System.out.println(precioElectrodomesticos);
        System.out.println(pLavadoras);
        System.out.println(pTelevisores);
    }
    
}
