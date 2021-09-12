package com.Pr1;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.*;
/**
 * Hello world!
 *
 */
public class Server 
{
    public static final int PORT = 1100;
    public static void main( String[] args )
    {
        System.setProperty("java.rmi.server.hostname", "25.86.45.96");
    	 try {
             Registry registry =  LocateRegistry.createRegistry(PORT);
             registry.rebind("Ofertas", new OfertasImp("Ofertas"));
         } catch (Exception e) {
             System.err.println("System exception" + e);
         }
    }
}
