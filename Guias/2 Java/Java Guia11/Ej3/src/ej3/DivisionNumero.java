/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

/**
 *
 * @author casad
 */
public class DivisionNumero {
    private Integer numero, numero1;

    public DivisionNumero(Integer numero, Integer numero1) {
        this.numero = numero;
        this.numero1 = numero1;
    }

    public DivisionNumero() {
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero1() {
        return numero1;
    }

    public void setNumero1(Integer numero1) {
        this.numero1 = numero1;
    }
    
    public Integer dividirNumeros(){
        return numero/numero1;
    }
}
