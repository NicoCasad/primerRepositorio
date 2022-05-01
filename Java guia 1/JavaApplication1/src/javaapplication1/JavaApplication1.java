
package javaapplication1;
import java.util.Scanner;

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, numero2, suma;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar numero 1");
        numero = leer.nextInt();
        System.out.println("Ingrese numero 2");
        numero2 = leer.nextInt();
        suma = numero + numero2;
        System.out.println("El resultado de la suma es: " + suma);
    }
    
}
