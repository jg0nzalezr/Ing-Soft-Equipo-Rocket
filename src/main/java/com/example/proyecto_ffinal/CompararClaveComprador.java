package com.example.proyecto_ffinal;

import java.io.IOException;

public class CompararClaveComprador {

    public static boolean compararClaveComprador(String usuario, String clave){

        boolean igual=false;

        Comprador comprador;
        Input input;

        input=new Input();

        try {
            input.abrir("compradores.ser");

            do {
                try {
                    comprador = input.leerComprador();
                    System.out.println(comprador.nombreUsuario);
                    if (comprador.nombreUsuario.equals(usuario) && comprador.clave.equals(clave)){
                        igual = true;
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

        return igual;

    }

}
