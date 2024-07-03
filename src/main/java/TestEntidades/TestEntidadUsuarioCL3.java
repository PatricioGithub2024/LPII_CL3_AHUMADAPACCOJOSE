package TestEntidades;

import Dao.ClassUsuarioCL3Imp;
import model.TblUsuariocl3;

public class TestEntidadUsuarioCL3 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	// Instancias 
	TblUsuariocl3 usuario = new TblUsuariocl3();
	ClassUsuarioCL3Imp crud = new ClassUsuarioCL3Imp();
	
	/*
	// Insertar Usuario
	usuario.setUsuarioCL2("Tomas");
	usuario.setPasswordCL2("1234");
	crud.RegistrarUsuario(usuario);
	*/
	/*
	// Listar Usuario
	List<TblUsuariocl2> listadousuarios = crud.ListadoUsuario();
	
	for(TblUsuariocl2 listar:listadousuarios) {

	System.out.println(
			"codigo :"+listar.getIdusuarioCL2()+"\n"+
			"nombre :"+listar.getUsuarioCL2()+"\n"+
			"precioVenta :"+listar.getPasswordCL2()+"\n"+
			"--------------------------------------------"+
			"\n"
			);		
	} // fin del metodo principal ...
	*/
	
	// validar usuario
	usuario = crud.validarUsuario("patricio", "123");
	
	if (usuario != null) {
        System.out.print("usuario existe");
    } else {
        
    	System.out.print("usuario no existe");
    }
}
	
}
