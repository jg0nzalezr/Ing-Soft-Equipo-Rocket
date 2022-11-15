package com.example.proyecto_ffinal;

import java.io.IOException;

public class CompararClaveVendedor {

    public static boolean compararClaveVendedor(String usuario, String clave){

        boolean igual=false;

        Vendedor vendedor;
        Input input;

        input=new Input();

        try {
            input.abrir("vendedores.ser");

            do {
                try {
                    vendedor = input.leerVendedor();
                    if (vendedor.nombreUsuario.equals(usuario) && vendedor.clave.equals(clave)){
                        igual = true;
                        break;
                    }
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                    System.out.println("La cagaste!");
                }
            } while (input != null);

            input.cerrar();

        }catch(IOException e) {
            e.printStackTrace();
        }

        return igual;

    }
}
