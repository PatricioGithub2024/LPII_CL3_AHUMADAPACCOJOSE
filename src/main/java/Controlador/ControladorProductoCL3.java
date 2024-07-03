package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassProductoCL3Imp;
import model.TblProductocl3;

/**
 * Servlet implementation class ControladorProductoCL3
 */
public class ControladorProductoCL3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProductoCL3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		TblProductocl3 producto = new TblProductocl3();
		ClassProductoCL3Imp crud = new ClassProductoCL3Imp();
		
		
		String accion=request.getParameter("accion");
		//aplicamos una condicion...
		if(accion!=null){
			switch(accion){
			case "Modificar":
				int codigo=Integer.parseInt(request.getParameter("cod"));
				//asignar el codigo...
				producto.setIdproductoCL3(codigo);
				TblProductocl3 buscarcod=crud.BuscarProducto(producto);
				//enviar los valores buscados por codigo de la base de datos
				//al formulario actualizar..
				request.setAttribute("idproducto",buscarcod.getIdproductoCL3());
				request.setAttribute("nombre",buscarcod.getNombreCL3());
				request.setAttribute("precioVen",buscarcod.getPrecioventaCL3());
				request.setAttribute("precioCom",buscarcod.getPreciocompCL3());
				request.setAttribute("estado",buscarcod.getEstadoCL3());
				request.setAttribute("descripcion",buscarcod.getDescripCL3());
								
				//redireccionar..
				request.getRequestDispatcher("/ActualizarProducto.jsp").forward(request, response);
				//salimos
				break;
				
			case "Eliminar":
				int codigoEliminar = Integer.parseInt(request.getParameter("cod"));
				//Asignamos el codigo a eliminar 
				producto.setIdproductoCL3(codigoEliminar);
				//Invocamos al metodo eliminar 
				crud.EliminarProducto(producto);
				//Refrescar el listado 			
				List<TblProductocl3> listado = crud.ListadoProducto();
				request.setAttribute("listadodeproductos", listado);
				//redireccionar..
				request.getRequestDispatcher("/ListadoDeProductos.jsp").forward(request, response);
				//salimos
				break;
				
			case "Listar":
							
				List<TblProductocl3> listadoproductos=crud.ListadoProducto();
				//invocamos el listado  de productos para la vista
				request.setAttribute("listadodeproductos",listadoproductos);
				//redireccionamos
				request.getRequestDispatcher("/ListadoDeProductos.jsp").forward(request, response);
				//salimos
				break;
			
			 }  //fin del switch...
			
			
		} 
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		//recuperamos los valores del formulario...
		String idpro=request.getParameter("idproducto");
		String nombrepro=request.getParameter("nombre");
		String precioven=request.getParameter("precioVen");
		String preciocom=request.getParameter("precioCom");		
		String estad=request.getParameter("estado");
		String descrip=request.getParameter("descripcion");
		
		List<TblProductocl3> listadoproducto=null;
				
		//instanciar las respectivas entidades...
		TblProductocl3 producto=new TblProductocl3();
		ClassProductoCL3Imp crud=new ClassProductoCL3Imp();
		
		//asignamos valores
		producto.setNombreCL3(nombrepro);
		producto.setPrecioventaCL3(Double.parseDouble(precioven));
		producto.setPreciocompCL3(Double.parseDouble(preciocom));
		producto.setEstadoCL3(estad);
		producto.setDescripCL3(descrip);
		 
		if(idpro!=null){
			//recupero el codigo a actualizar 
			int cod=Integer.parseInt(idpro);
			//asigno el codigo a actualizar
			producto.setIdproductoCL3(cod);
			//invoco al metodo actualizar
			crud.ActualizarProducto(producto);
			//Invocamos al metodo listado
			listadoproducto=crud.ListadoProducto();
		}else{
			//invocamos la metodo registrar...
			crud.RegistrarProducto(producto);
			//actualizador listado de clientes
			listadoproducto=crud.ListadoProducto();
		} //fin de else
		
		
		//invocamos el listado  de productos para la vista
		request.setAttribute("listadodeproductos",listadoproducto);
		//redireccionamos
		request.getRequestDispatcher("/ListadoDeProductos.jsp").forward(request, response);
		
	}

}
