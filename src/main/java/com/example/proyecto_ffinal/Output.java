package com.example.proyecto_ffinal;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Output {
    private FileOutputStream file;
    private ObjectOutputStream output;

    //Abrir fichero
    public void abrir(String nombreArchivo) throws IOException
    {
        file = new FileOutputStream( nombreArchivo );
        output = new ObjectOutputStream(file);
    }

    //Cerrar fichero
    public void cerrar() throws IOException
    {
        if (output!=null)
            output.close();
    }

    //Escribir datos del comprador
    public void escribirComprador(Comprador comprador) throws IOException
    {
        if (output!=null)
            output.writeObject(comprador);
    }

    //Escribir datos del vendedor
    public void escribirVendedor(Vendedor vendedor) throws IOException
    {
        if (output!=null)
            output.writeObject(vendedor);
    }


}
