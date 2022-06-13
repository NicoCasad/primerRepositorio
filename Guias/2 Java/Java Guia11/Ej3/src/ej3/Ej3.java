/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author casad
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        DivisionNumero nDivisionNumero = new DivisionNumero();
        
        
        
        try{
            System.out.println("Ingrese numero");
            nDivisionNumero.setNumero(Integer.parseInt(leer.next()));
            System.out.println("Ingrese otro numero");
            nDivisionNumero.setNumero1(Integer.parseInt(leer.next()));
            System.out.println("Division: " + nDivisionNumero.dividirNumeros());
        }catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }catch(InputMismatchException ime){
            System.out.println(ime.fillInStackTrace());
        }catch(NumberFormatException nfe){
            System.out.println(nfe);
        }
    }
    
}
