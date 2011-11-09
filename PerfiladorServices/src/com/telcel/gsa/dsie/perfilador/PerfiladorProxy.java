package com.telcel.gsa.dsie.perfilador;

public class PerfiladorProxy implements com.telcel.gsa.dsie.perfilador.Perfilador {
  private String _endpoint = null;
  private com.telcel.gsa.dsie.perfilador.Perfilador perfilador = null;
  
  public PerfiladorProxy() {
    _initPerfiladorProxy();
  }
  
  public PerfiladorProxy(String endpoint) {
    _endpoint = endpoint;
    _initPerfiladorProxy();
  }
  
  private void _initPerfiladorProxy() {
    try {
      perfilador = (new com.telcel.gsa.dsie.perfilador.PerfiladorServiceLocator()).getPerfilador();
      if (perfilador != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)perfilador)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)perfilador)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (perfilador != null)
      ((javax.xml.rpc.Stub)perfilador)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.telcel.gsa.dsie.perfilador.Perfilador getPerfilador() {
    if (perfilador == null)
      _initPerfiladorProxy();
    return perfilador;
  }
  
  public com.telcel.gsa.dsie.perfilador.PerfiladorDTO obtenerPerfil(java.lang.String telefono) throws java.rmi.RemoteException{
    if (perfilador == null)
      _initPerfiladorProxy();
    return perfilador.obtenerPerfil(telefono);
  }
  
  public int isLineaRegistroAnterior(java.lang.String telefono) throws java.rmi.RemoteException{
    if (perfilador == null)
      _initPerfiladorProxy();
    return perfilador.isLineaRegistroAnterior(telefono);
  }
  
  public boolean validAcceso(java.lang.String telefono) throws java.rmi.RemoteException{
    if (perfilador == null)
      _initPerfiladorProxy();
    return perfilador.validAcceso(telefono);
  }
  
  
}