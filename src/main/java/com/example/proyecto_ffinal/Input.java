package com.example.proyecto_ffinal;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Input {

    private FileInputStream file;
    private ObjectInputStream input;

    //Abrir fichero
    public void abrir(String nombreArchivo) throws IOException
    {
        file = new FileInputStream( nombreArchivo );
        input = new ObjectInputStream (file);
    }

    //Cerrar fichero
    public void cerrar() throws IOException
    {
        if (input!=null )
            input.close();
    }

    //Lectura de datos de comprador
    public Comprador leerComprador () throws IOException, ClassNotFoundException
    {
        Comprador comprador = null;
        if (input!=null) {
            try {
                comprador = (Comprador) input.readObject();
            } catch (EOFException eof) {
                eof.printStackTrace();
            }
        }
        return comprador;
    }

    //Lectura de datos del vendedor
    public Vendedor leerVendedor () throws IOException, ClassNotFoundException
    {
        Vendedor vendedor = null;
        if (input!=null) {
            try {
                vendedor = (Vendedor) input.readObject();
            } catch (EOFException eof) {
                eof.printStackTrace();
            }
        }
        return vendedor;
    }


}
