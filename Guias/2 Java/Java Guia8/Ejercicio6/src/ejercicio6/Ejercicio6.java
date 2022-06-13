/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.*;
/**
 *
 * @author casad
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        HashMap<String, Double> producto = new HashMap();
        int opcion;
        String prod;
        Double precio;
        do{
            System.out.println("Inngrese el numero de la operacion que quiere realizar");
            System.out.println("1- Introducir elemento");
            System.out.println("2- Modificar precio");
            System.out.println("3- Eliminar producto");
            System.out.println("4- Mostrar productos");
            System.out.println("5- salir");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1: 
                    System.out.println("Ingrese el nombre del producto a ingresar");
                    prod = leer.next();
                    System.out.println("Ingrese el precio del producto");
                    precio = leer.nextDouble();
                    producto.put(prod, precio);
                    continue;
                case 2:
                    int contador = 0;
                    do{
                        System.out.println("Ingrese el producto al que le quiere cambiar el precio");
                        prod = leer.next();
                        for(Map.Entry<String, Double> recorrerProd : producto.entrySet()){
                            if(recorrerProd.getKey().equals(prod) == true){
                                System.out.println("El precio del prodcuto es: " + recorrerProd.getValue());
                                System.out.println("Escriba el nuevo precio del producto");
                                precio = leer.nextDouble();
                                recorrerProd.setValue(precio);
                                System.out.println("El precio del producto se cambio a: $" + precio);
                                contador = 1;
                            }else if(prod.toLowerCase().equals("salir")){
                                contador = 1;
                            }else{
                                System.out.println("No se encontro el prodcuto, vuelva a ingresar uno nuevamente");
                            }
                        }
                    }while(contador != 1);
                    continue;
                case 3:
                    contador = 0;
                    do{
                        System.out.println("Ingrese el producto que quiere eliminar");
                        prod = leer.next();
                        for(Map.Entry<String, Double> recorrerProd : producto.entrySet()){
                            if(recorrerProd.getKey().equals(prod) == true){
                                producto.remove(recorrerProd.getKey(), recorrerProd.getValue());
                                contador = 1;
                            }else if(prod.toLowerCase().equals("salir")){
                                contador = 1;
                            }else if(recorrerProd.getKey().equals(prod) == false){
                                System.out.println("No se encontro el prodcuto, vuelva a ingresar uno nuevamente");
                            }
                        }
                    }while(contador != 1);
                    continue;
                case 4:
                    for(Map.Entry<String, Double> recorrerProd : producto.entrySet()){
                        System.out.println(recorrerProd);
                    }
                    continue;
                case 5:
                    continue;
                default:
                    System.out.println("Ingrese una de las opciones");
                    continue;
            }
        }while(opcion != 5);
    }
    
}
