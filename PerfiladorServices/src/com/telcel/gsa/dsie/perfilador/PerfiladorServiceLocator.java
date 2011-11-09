/**
 * PerfiladorServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.telcel.gsa.dsie.perfilador;

public class PerfiladorServiceLocator extends org.apache.axis.client.Service implements com.telcel.gsa.dsie.perfilador.PerfiladorService {

    public PerfiladorServiceLocator() {
    }


    public PerfiladorServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PerfiladorServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Perfilador
    private java.lang.String Perfilador_address = "http://mitelcelab.itelcel.com:7001/PerfiladorServices/services/Perfilador";

    public java.lang.String getPerfiladorAddress() {
        return Perfilador_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PerfiladorWSDDServiceName = "Perfilador";

    public java.lang.String getPerfiladorWSDDServiceName() {
        return PerfiladorWSDDServiceName;
    }

    public void setPerfiladorWSDDServiceName(java.lang.String name) {
        PerfiladorWSDDServiceName = name;
    }

    public com.telcel.gsa.dsie.perfilador.Perfilador getPerfilador() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Perfilador_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPerfilador(endpoint);
    }

    public com.telcel.gsa.dsie.perfilador.Perfilador getPerfilador(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.telcel.gsa.dsie.perfilador.PerfiladorSoapBindingStub _stub = new com.telcel.gsa.dsie.perfilador.PerfiladorSoapBindingStub(portAddress, this);
            _stub.setPortName(getPerfiladorWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPerfiladorEndpointAddress(java.lang.String address) {
        Perfilador_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.telcel.gsa.dsie.perfilador.Perfilador.class.isAssignableFrom(serviceEndpointInterface)) {
                com.telcel.gsa.dsie.perfilador.PerfiladorSoapBindingStub _stub = new com.telcel.gsa.dsie.perfilador.PerfiladorSoapBindingStub(new java.net.URL(Perfilador_address), this);
                _stub.setPortName(getPerfiladorWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Perfilador".equals(inputPortName)) {
            return getPerfilador();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://perfilador.dsie.gsa.telcel.com", "PerfiladorService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://perfilador.dsie.gsa.telcel.com", "Perfilador"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Perfilador".equals(portName)) {
            setPerfiladorEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
