<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="samplePerfiladorProxyid" scope="session" class="com.telcel.gsa.dsie.perfilador.PerfiladorProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
samplePerfiladorProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = samplePerfiladorProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        samplePerfiladorProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.telcel.gsa.dsie.perfilador.Perfilador getPerfilador10mtemp = samplePerfiladorProxyid.getPerfilador();
if(getPerfilador10mtemp == null){
%>
<%=getPerfilador10mtemp %>
<%
}else{
        if(getPerfilador10mtemp!= null){
        String tempreturnp11 = getPerfilador10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String telefono_1id=  request.getParameter("telefono50");
            java.lang.String telefono_1idTemp = null;
        if(!telefono_1id.equals("")){
         telefono_1idTemp  = telefono_1id;
        }
        com.telcel.gsa.dsie.perfilador.PerfiladorDTO obtenerPerfil13mtemp = samplePerfiladorProxyid.obtenerPerfil(telefono_1idTemp);
if(obtenerPerfil13mtemp == null){
%>
<%=obtenerPerfil13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">esConsolidada:</TD>
<TD>
<%
if(obtenerPerfil13mtemp != null){
%>
<%=obtenerPerfil13mtemp.isEsConsolidada()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nombre:</TD>
<TD>
<%
if(obtenerPerfil13mtemp != null){
java.lang.String typenombre18 = obtenerPerfil13mtemp.getNombre();
        String tempResultnombre18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenombre18));
        %>
        <%= tempResultnombre18 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">plan:</TD>
<TD>
<%
if(obtenerPerfil13mtemp != null){
java.lang.String typeplan20 = obtenerPerfil13mtemp.getPlan();
        String tempResultplan20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeplan20));
        %>
        <%= tempResultplan20 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nombrePlan:</TD>
<TD>
<%
if(obtenerPerfil13mtemp != null){
java.lang.String typenombrePlan22 = obtenerPerfil13mtemp.getNombrePlan();
        String tempResultnombrePlan22 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenombrePlan22));
        %>
        <%= tempResultnombrePlan22 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">plataforma:</TD>
<TD>
<%
if(obtenerPerfil13mtemp != null){
java.lang.String typeplataforma24 = obtenerPerfil13mtemp.getPlataforma();
        String tempResultplataforma24 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeplataforma24));
        %>
        <%= tempResultplataforma24 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">suspendida:</TD>
<TD>
<%
if(obtenerPerfil13mtemp != null){
%>
<%=obtenerPerfil13mtemp.isSuspendida()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">region:</TD>
<TD>
<%
if(obtenerPerfil13mtemp != null){
java.lang.String typeregion28 = obtenerPerfil13mtemp.getRegion();
        String tempResultregion28 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeregion28));
        %>
        <%= tempResultregion28 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nip:</TD>
<TD>
<%
if(obtenerPerfil13mtemp != null){
java.lang.String typenip30 = obtenerPerfil13mtemp.getNip();
        String tempResultnip30 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenip30));
        %>
        <%= tempResultnip30 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">apellidos:</TD>
<TD>
<%
if(obtenerPerfil13mtemp != null){
java.lang.String typeapellidos32 = obtenerPerfil13mtemp.getApellidos();
        String tempResultapellidos32 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeapellidos32));
        %>
        <%= tempResultapellidos32 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">statusPass:</TD>
<TD>
<%
if(obtenerPerfil13mtemp != null){
%>
<%=obtenerPerfil13mtemp.getStatusPass()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">esTelcel:</TD>
<TD>
<%
if(obtenerPerfil13mtemp != null){
%>
<%=obtenerPerfil13mtemp.isEsTelcel()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">statusNip:</TD>
<TD>
<%
if(obtenerPerfil13mtemp != null){
%>
<%=obtenerPerfil13mtemp.getStatusNip()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">cuenta:</TD>
<TD>
<%
if(obtenerPerfil13mtemp != null){
java.lang.String typecuenta40 = obtenerPerfil13mtemp.getCuenta();
        String tempResultcuenta40 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecuenta40));
        %>
        <%= tempResultcuenta40 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">tecnologia:</TD>
<TD>
<%
if(obtenerPerfil13mtemp != null){
java.lang.String typetecnologia42 = obtenerPerfil13mtemp.getTecnologia();
        String tempResulttecnologia42 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetecnologia42));
        %>
        <%= tempResulttecnologia42 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">perfil:</TD>
<TD>
<%
if(obtenerPerfil13mtemp != null){
java.lang.String typeperfil44 = obtenerPerfil13mtemp.getPerfil();
        String tempResultperfil44 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeperfil44));
        %>
        <%= tempResultperfil44 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">longiNip:</TD>
<TD>
<%
if(obtenerPerfil13mtemp != null){
%>
<%=obtenerPerfil13mtemp.getLongiNip()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">codigoRespuesta:</TD>
<TD>
<%
if(obtenerPerfil13mtemp != null){
%>
<%=obtenerPerfil13mtemp.getCodigoRespuesta()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 52:
        gotMethod = true;
        String telefono_2id=  request.getParameter("telefono55");
            java.lang.String telefono_2idTemp = null;
        if(!telefono_2id.equals("")){
         telefono_2idTemp  = telefono_2id;
        }
        int isLineaRegistroAnterior52mtemp = samplePerfiladorProxyid.isLineaRegistroAnterior(telefono_2idTemp);
        String tempResultreturnp53 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(isLineaRegistroAnterior52mtemp));
        %>
        <%= tempResultreturnp53 %>
        <%
break;
case 57:
        gotMethod = true;
        String telefono_3id=  request.getParameter("telefono60");
            java.lang.String telefono_3idTemp = null;
        if(!telefono_3id.equals("")){
         telefono_3idTemp  = telefono_3id;
        }
        boolean validAcceso57mtemp = samplePerfiladorProxyid.validAcceso(telefono_3idTemp);
        String tempResultreturnp58 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(validAcceso57mtemp));
        %>
        <%= tempResultreturnp58 %>
        <%
break;
}
} catch (Exception e) { 
%>
exception: <%= e %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>