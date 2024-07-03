package TestEntidades;

import java.util.List;

import Dao.ClassProductoCL3Imp;
import model.TblProductocl3;

public class TestEntidadProductoCL3 {

	public static void main(String[] args) {

		
		// instancias
		TblProductocl3 prod = new TblProductocl3();
		ClassProductoCL3Imp crud = new ClassProductoCL3Imp();
		
		/*
		// insertar
		prod.setNombreCL3("Aceitunas");
		prod.setPrecioventaCL3(4.50);
		prod.setPreciocompCL3(3.90);
		prod.setEstadoCL3("vigente");
		prod.setDescripCL3("oferta");
		
		crud.RegistrarProducto(prod);
		*/
		
		
		/*
		// listar
		
		List<TblProductocl3> listadoproductos = crud.ListadoProducto();
			
		for(TblProductocl3 listar:listadoproductos) {
	
		System.out.println(
				"codigo :"+listar.getIdproductoCL3()+"\n"+
				"nombre :"+listar.getNombreCL3()+"\n"+
				"precioVenta :"+listar.getPrecioventaCL3()+"\n"+
				"precioCompra :"+listar.getPreciocompCL3()+"\n"+
				"Estado :"+listar.getEstadoCL3() +"\n"+
				"Descripcion :"+listar.getDescripCL3()+"\n"+
				"--------------------------------------------"+
				"\n"
				);
*/
		/*
		//actualizar
		prod.setIdproductoCL3(2);
		prod.setNombreCL3("Leche Endulcorada");
		prod.setPrecioventaCL3(4.50);
		prod.setPreciocompCL3(5.90);
		prod.setEstadoCL3("agotado");
		prod.setDescripCL3("normal");		
		// invocamos el metodo actualizar
		crud.ActualizarProducto(prod);
		*/
		
		/*
		//eliminar
		//eliminamos el registro con idclientede numero cuatro
		prod.setIdproductoCL3(3);
		//invocamos el metodo eliminar datos de la BD
		crud.EliminarProducto(prod);
		*/
		
		//buscar cliente
		prod.setIdproductoCL3(2);
		TblProductocl3 buscarproducto = crud.BuscarProducto(prod);
		// imprimir los datos por pantalla
		System.out.println(
				"codigo :"+buscarproducto.getIdproductoCL3()+"\n"+
				"nombre :"+buscarproducto.getNombreCL3()+"\n"+
				"precioVenta :"+buscarproducto.getPrecioventaCL3()+"\n"+
				"precioCompra :"+buscarproducto.getPreciocompCL3()+"\n"+
				"Estado :"+buscarproducto.getEstadoCL3() +"\n"+
				"Descripcion :"+buscarproducto.getDescripCL3()+"\n"+
				"--------------------------------------------"+
				"\n"
				);

		
	} // fin del metodo principal ...
		
		
	

	}


