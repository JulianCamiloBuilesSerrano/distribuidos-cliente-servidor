package com.Pr1;
import java.rmi.registry.*;
import java.rmi.server.*;
import java.rmi.*;
public class Cliente {
	public static final int PORT = 1000;
    public static final String IP = "25.86.45.96";
	public static void main(String args[]) {
        int res = 0;
        try {
            System.out.println("Buscando Objeto ");
            Registry registry =LocateRegistry.getRegistry(IP,PORT);
            Ofertas oferta = (Ofertas) registry.lookup("Ofertas");
            oferta.consultarOfertas("hola");
        } catch (Exception e) {
            System.err.println(" System exception" + e);
        }
        System.exit(0);
    }
}
