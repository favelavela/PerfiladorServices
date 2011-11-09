/**
 * PerfiladorSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.telcel.gsa.dsie.perfilador;

public class PerfiladorSoapBindingSkeleton implements com.telcel.gsa.dsie.perfilador.Perfilador, org.apache.axis.wsdl.Skeleton {
    private com.telcel.gsa.dsie.perfilador.Perfilador impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://perfilador.dsie.gsa.telcel.com", "telefono"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("obtenerPerfil", _params, new javax.xml.namespace.QName("http://perfilador.dsie.gsa.telcel.com", "obtenerPerfilReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://perfilador.dsie.gsa.telcel.com", "PerfiladorDTO"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://perfilador.dsie.gsa.telcel.com", "obtenerPerfil"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("obtenerPerfil") == null) {
            _myOperations.put("obtenerPerfil", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("obtenerPerfil")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://perfilador.dsie.gsa.telcel.com", "telefono"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("isLineaRegistroAnterior", _params, new javax.xml.namespace.QName("http://perfilador.dsie.gsa.telcel.com", "isLineaRegistroAnteriorReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://perfilador.dsie.gsa.telcel.com", "isLineaRegistroAnterior"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("isLineaRegistroAnterior") == null) {
            _myOperations.put("isLineaRegistroAnterior", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("isLineaRegistroAnterior")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://perfilador.dsie.gsa.telcel.com", "telefono"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("validAcceso", _params, new javax.xml.namespace.QName("http://perfilador.dsie.gsa.telcel.com", "validAccesoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://perfilador.dsie.gsa.telcel.com", "validAcceso"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("validAcceso") == null) {
            _myOperations.put("validAcceso", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("validAcceso")).add(_oper);
    }

    public PerfiladorSoapBindingSkeleton() {
        this.impl = new com.telcel.gsa.dsie.perfilador.PerfiladorSoapBindingImpl();
    }

    public PerfiladorSoapBindingSkeleton(com.telcel.gsa.dsie.perfilador.Perfilador impl) {
        this.impl = impl;
    }
    public com.telcel.gsa.dsie.perfilador.PerfiladorDTO obtenerPerfil(java.lang.String telefono) throws java.rmi.RemoteException
    {
        com.telcel.gsa.dsie.perfilador.PerfiladorDTO ret = impl.obtenerPerfil(telefono);
        return ret;
    }

    public int isLineaRegistroAnterior(java.lang.String telefono) throws java.rmi.RemoteException
    {
        int ret = impl.isLineaRegistroAnterior(telefono);
        return ret;
    }

    public boolean validAcceso(java.lang.String telefono) throws java.rmi.RemoteException
    {
        boolean ret = impl.validAcceso(telefono);
        return ret;
    }

}
