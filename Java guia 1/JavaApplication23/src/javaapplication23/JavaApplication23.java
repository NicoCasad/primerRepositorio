/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

/**
 *
 * @author casad
 */
public class JavaApplication23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int aux;
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                matriz[i][j] = (int)(Math.random()*10)+1;
            }
        }
        for(int n = 0; n < 4; n++){
            System.out.println("");
            for(int m = 0; m < 4; m++){
                System.out.print(matriz[n][m] + " "); 
            }
        }
        for(int l = 0; l < 4; l++){
            for(int k = 0; k < 4; k++){
                if (k > l){
                  aux = matriz[l][k];
                  matriz[l][k]= matriz[k][l];
                  matriz[k][l]= aux;
                }
            }
            System.out.println(" ");
        }
        for(int a = 0; a < 4; a++){
            System.out.println("");
            for(int b = 0; b < 4; b++){
                System.out.print(matriz[a][b] + " "); 
            }
        }
    }
    
}
