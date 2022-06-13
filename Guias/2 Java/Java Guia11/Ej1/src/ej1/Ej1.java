/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

/**
 *
 * @author casad
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona nPersona = null;
        try{
         System.out.println(nPersona.esMayorDeEdad());
        }catch(NullPointerException a){
            System.out.println(a.fillInStackTrace());
        }
    }
    
}
