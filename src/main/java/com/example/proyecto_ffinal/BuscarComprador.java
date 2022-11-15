package com.example.proyecto_ffinal;

import java.io.IOException;

public class BuscarComprador {

    public static boolean buscarComprador(String usuario){
        boolean existe=false;

        Comprador comprador;
        Input input;

        input=new Input();

        try {
            input.abrir("compradores.ser");

            do {
                try {
                    comprador = input.leerComprador();
                    if (comprador.nombreUsuario.equals(usuario)) {
                        existe = true;
                        break;
                    }
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            } while (input != null);

            input.cerrar();

        }catch(IOException e) {
            e.printStackTrace();
        }

        return existe;
    }

}
