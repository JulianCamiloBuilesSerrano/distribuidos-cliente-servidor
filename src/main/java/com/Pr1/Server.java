package com.Pr1;
import java.rmi.*;
import java.rmi.server.*;
/**
 * Hello world!
 *
 */
public class Server 
{
    public static void main( String[] args )
    {
    	 try {
             OfertasImp server = new OfertasImp("rmi://localhost:8000/objeto" );
         } catch (Exception e) {
             System.err.println("System exception" + e);
         }
    }
}
