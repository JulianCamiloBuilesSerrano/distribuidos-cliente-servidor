package com.Pr1;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
public class OfertasImp extends UnicastRemoteObject implements Ofertas {
	
	public OfertasImp() throws RemoteException{
		super();
    }
	
	@Override
	public void registrarOfertas(String r) throws RemoteException {
		System.out.println(r);
	}

	@Override
	public void consultarOfertas(String r) throws RemoteException {
		System.out.println(r);

	}

}
