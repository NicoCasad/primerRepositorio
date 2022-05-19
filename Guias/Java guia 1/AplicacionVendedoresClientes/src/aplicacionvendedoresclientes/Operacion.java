/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionvendedoresclientes;

/**
 *
 * @author casad
 */
public class Operacion {
    private int id, numeroProducto;
    private String nombreProducto, descripcion;
    Cliente clienteNuevo = new Cliente();
    Vendedor nuevoVendedor = new Vendedor();
    
    public Operacion(){
        
    }
    public Operacion(int id, int numeroProducto, String nombreProducto, String descripcion) {
        this.id = id;
        this.numeroProducto = numeroProducto;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroProducto() {
        return numeroProducto;
    }

    public void setNumeroProducto(int numeroProducto) {
        this.numeroProducto = numeroProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Vendedor getNuevoVendedor() {
        return nuevoVendedor;
    }

    public void setNuevoVendedor(Vendedor nuevoVendedor) {
        this.nuevoVendedor = nuevoVendedor;
    }
    
    public void crearOperacion(){
        
    }
}
