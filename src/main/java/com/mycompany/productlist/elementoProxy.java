
package com.mycompany.productlist;


public class elementoProxy{
    private String categoria;
    public elementoProxy(String categoria){
        this.categoria=categoria;
    }
    
    public Elemento crear(String nombre, float precio){
        return new Elemento(nombre, this.categoria,precio);
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return this.categoria;
    }
    
}
