/**
 * Perfilador.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.telcel.gsa.dsie.perfilador;

public interface Perfilador extends java.rmi.Remote {
    public com.telcel.gsa.dsie.perfilador.PerfiladorDTO obtenerPerfil(java.lang.String telefono) throws java.rmi.RemoteException;
    public int isLineaRegistroAnterior(java.lang.String telefono) throws java.rmi.RemoteException;
    public boolean validAcceso(java.lang.String telefono) throws java.rmi.RemoteException;
}
