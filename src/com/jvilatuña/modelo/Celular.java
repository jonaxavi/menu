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
public class Celular {
    private String marca;
    private String modelo;
    private String precio;
    private int numeroTelefonico;
    private String operadora;

    public Celular() {
    }

    public Celular(String marca, String modelo, String precio, int numeroTelefonico, String operadora) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.numeroTelefonico = numeroTelefonico;
        this.operadora = operadora;
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

    public void setNumeroelefonico(int numeroelefonico) {
        this.numeroTelefonico = numeroelefonico;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
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

    public int getNumeroelefonico() {
        return numeroTelefonico;
    }

    public String getOperadora() {
        return operadora;
    }
    
}
