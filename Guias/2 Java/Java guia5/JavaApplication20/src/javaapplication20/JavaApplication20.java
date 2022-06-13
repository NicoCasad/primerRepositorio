/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;
/**
 *
 * @author casad
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vectorEnteros = new int[100];
        
        for(int i = 0; i < 100; i++){
            vectorEnteros[i] = i;
        }
        for(int j = 99; j >= 0; j = j - 1){
            System.out.println(vectorEnteros[j]);
        }
    }
    
}
