/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author casad
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal gato = new Gato("luqui", "sopaipilla", "brownie", 10);
        System.out.println(gato.alimentarse());
        
        Animal gato1 = new Gato("sofi", "lentejas", "negro", 3);
        System.out.println(gato1.alimentarse());
        
        Animal perro = new Perro("rodriguau", "sancor bebe 3", "labrador", 5);
        System.out.println(perro.alimentarse());
        
        Animal caballo = new Caballo("lucrecio", "lechuga", "pony", 2);
        System.out.println(caballo.alimentarse());
    }
    
}
