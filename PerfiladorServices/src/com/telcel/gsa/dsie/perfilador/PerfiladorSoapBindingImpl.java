/**
 * PerfiladorSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.telcel.gsa.dsie.perfilador;

public class PerfiladorSoapBindingImpl implements com.telcel.gsa.dsie.perfilador.Perfilador{
    public com.telcel.gsa.dsie.perfilador.PerfiladorDTO obtenerPerfil(java.lang.String telefono) throws java.rmi.RemoteException {
    	PerfiladorProxy pp = new PerfiladorProxy(null);
        PerfiladorDTO pdto = null;
        //int codigoResp = -1;
        pdto = pp.obtenerPerfil(telefono);
        //codigoResp = pdto.getCodigoRespuesta();
    	return pdto;
    }

    public int isLineaRegistroAnterior(java.lang.String telefono) throws java.rmi.RemoteException {
    	PerfiladorProxy pp = new PerfiladorProxy(null);
        PerfiladorDTO pdto = null;
        int codigoResp = pp.isLineaRegistroAnterior(telefono);
    	//return pdto;
        return codigoResp;
    }

    public boolean validAcceso(java.lang.String telefono) throws java.rmi.RemoteException {
        return false;
    }

}
