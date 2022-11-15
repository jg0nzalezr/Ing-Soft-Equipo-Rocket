package com.example.proyecto_ffinal;

import java.io.Serializable;

public class Producto implements Serializable {

    private String nombreProducto;
    private int idProducto;

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }
}
