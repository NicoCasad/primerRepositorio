/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

/**
 *
 * @author casad
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] nomb = new String[3][3];
        
        try{
            System.out.println(nomb[4][5]);
        }catch(ArrayIndexOutOfBoundsException error){
            System.out.println(error.getMessage());
        }
    }
    
}
