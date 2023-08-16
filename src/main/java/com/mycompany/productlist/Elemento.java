
package com.mycompany.productlist;


public class Elemento {
    private String nombre,categoria;
    private float precio;
    public Elemento(String nombre, String categoria,float precio){
        this.nombre=nombre;
        this.categoria=categoria;
        this.precio=precio;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public float getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.categoria+this.nombre+this.precio;
    }
}

