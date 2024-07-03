package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassUsuarioCL3Imp;
import model.TblUsuariocl3;

/**
 * Servlet implementation class ControladorUsuarioCL3
 */
public class ControladorUsuarioCL3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorUsuarioCL3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String login = request.getParameter("usuario");
	     String clave = request.getParameter("password");

	     //instancias
	     TblUsuariocl3 usu = new TblUsuariocl3();
	     ClassUsuarioCL3Imp crud = new ClassUsuarioCL3Imp();
	     
	     usu = crud.validarUsuario(login, clave);

	        if (usu != null) {
	            
	            request.setAttribute("mensaje", "Credenciales correctas");
	            request.getRequestDispatcher("/MenuUsuario.jsp").forward(request, response);
	        } else {
	            
	            request.setAttribute("mensaje", "Credenciales incorrectas");
	            request.getRequestDispatcher("/LoginUsuarios.jsp").forward(request, response);
	        }
	}

}
