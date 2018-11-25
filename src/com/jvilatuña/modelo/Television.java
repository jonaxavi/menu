/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jvilatuña.modelo;

/**
 *
 * @author UseR
 */
public class Television {
    private String marca;
    private String modelo;
    private String precio;

    public Television() {
    }

    public Television(String marca, String modelo, String precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPrecio() {
        return precio;
    }
    
}
