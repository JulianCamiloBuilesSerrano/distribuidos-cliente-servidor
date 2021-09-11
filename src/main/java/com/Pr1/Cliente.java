package com.Pr1;
import java.rmi.registry.*;
import java.rmi.server.*;
import java.rmi.*;
public class Cliente {
	
	public static void main(String args[]) {
        int res = 0;
        try {
            System.out.println("Buscando Objeto ");
            Ofertas oferta = (Ofertas) Naming.lookup("rmi://" + "localhost:8000" + "/" + "objeto");
            oferta.consultarOfertas("hola");
        } catch (Exception e) {
            System.err.println(" System exception" + e);
        }
        System.exit(0);
    }
}
