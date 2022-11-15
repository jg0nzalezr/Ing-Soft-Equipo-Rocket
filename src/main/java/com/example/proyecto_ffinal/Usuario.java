package com.example.proyecto_ffinal;

import java.io.Serializable;

public abstract class Usuario implements Serializable {

    protected String nombreUsuario;
    protected String clave;
    protected String tipoUsuario;
    protected int idUsuario;

    public Usuario(){
        nombreUsuario="";
        idUsuario=0;
    }

    public Usuario(String nombreUsuario, int idUsuario){
        this.nombreUsuario=nombreUsuario;
        this.idUsuario=idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public String getClave() {
        return clave;
    }
    public String getTipoUsuario() {
        return tipoUsuario;
    }
}
