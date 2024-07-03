package Interfaces;

import java.util.List;

import model.TblUsuariocl3;

public interface IUsuariocl3 {
	
	//declaremos los metodos
	public void RegistrarUsuario(TblUsuariocl3 usuario);	
	public List<TblUsuariocl3> ListadoUsuario();
	public TblUsuariocl3 validarUsuario(String vLogin, String vClave);
	
}
