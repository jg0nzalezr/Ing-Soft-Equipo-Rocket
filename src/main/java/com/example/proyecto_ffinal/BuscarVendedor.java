package com.example.proyecto_ffinal;

import java.io.IOException;

public class BuscarVendedor {

    public static boolean buscarVendedor(String usuario){
        boolean existe=false;

        Vendedor vendedor;
        Input input;

        input=new Input();

        try {
            input.abrir("vendedores.ser");

            do {
                try {
                    vendedor = input.leerVendedor();
                    if (vendedor.nombreUsuario.equals(usuario)) {
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
