<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body  bgcolor="#c5dec9">
<h1 align="center">Actualizar Producto</h1>

<form  method="post" action="ControladorProductoCL3">

<%

	String cod=request.getAttribute("idproducto").toString();
	String nom=(request.getAttribute("nombre")!=null)?request.getAttribute("nombre").toString():"";
	String pven=(request.getAttribute("precioVen")!=null)?request.getAttribute("precioVen").toString():"";
	String pcom=(request.getAttribute("precioCom")!=null)?request.getAttribute("precioCom").toString():"";
	String est=(request.getAttribute("estado")!=null)?request.getAttribute("estado").toString():"";
	String des=(request.getAttribute("descripcion")!=null)?request.getAttribute("descripcion").toString():"";
 

%>
<table align="center"  borde="2">
<input type="hidden" name="idproducto"  value="<%=cod%>">
<tr>
<td>Nombre</td>
<td><input type="text" name="nombre" value="<%=nom%>"></td>
</tr>
<tr>
<td>Precio de venta</td>
<td><input type="text" name="precioVen" value="<%=pven%>"></td>
</tr>
<tr>
<td>Precio de compra</td>
<td><input type="text" name="precioCom" value="<%=pcom%>"></td>
</tr>
<tr>
<td>Estado</td>
<td><input type="text" name="estado" value="<%=est%>"></td>
</tr>
<tr>
<td>Descripcion</td>
<td><input type="text" name="descripcion" value="<%=des%>"></td>
</tr>

<tr>
<td colspan="2" align="center"><input type="submit" value="Actualizar Producto"></td>
</tr>

</table>



</form>

</body>

</html>