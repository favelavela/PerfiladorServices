/**
 * PerfiladorService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.telcel.gsa.dsie.perfilador;

public interface PerfiladorService extends javax.xml.rpc.Service {
    public java.lang.String getPerfiladorAddress();

    public com.telcel.gsa.dsie.perfilador.Perfilador getPerfilador() throws javax.xml.rpc.ServiceException;

    public com.telcel.gsa.dsie.perfilador.Perfilador getPerfilador(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
