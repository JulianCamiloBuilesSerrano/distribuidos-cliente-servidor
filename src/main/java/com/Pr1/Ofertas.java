package com.Pr1;

public interface Ofertas extends java.rmi.Remote{
public void registrarOfertas(String r ) throws java.rmi.RemoteException;
public void consultarOfertas( String r)	throws java.rmi.RemoteException; 
}
