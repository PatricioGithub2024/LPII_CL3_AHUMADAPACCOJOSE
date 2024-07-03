package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProductocl3;
import model.TblProductocl3;

public class ClassProductoCL3Imp implements IProductocl3{

	@Override
	public void RegistrarProducto(TblProductocl3 producto) {
		//establecer conexion con la unidad de persistencia...
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LPII_CL3_AHUMADAPACCOJOSE");
	    //permite gestionar entidades
		EntityManager em=fabr.createEntityManager();
		//iniciar transaccion
		em.getTransaction().begin();
		//registramos
		em.persist(producto);
		//emitimos mensaje por consola
		System.out.println("Producto registrado en la BD correctamente");
		//confirmamos
		em.getTransaction().commit();
		//cerramos la transaccion
		em.close();		
		
	}

	@Override
	public List<TblProductocl3> ListadoProducto() {
		//establecemos la conexion con la unidad de persistencia..
        EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LPII_CL3_AHUMADAPACCOJOSE");
        //gestionamos las entidads
        EntityManager em=fabr.createEntityManager();
        //iniciamos la transaccion
        em.getTransaction().begin();
        //recuperamos los clientes  de la base de datos
        //***********utilizando jpql
        List<TblProductocl3> listadoProductos = em.createQuery("select c from TblProductocl3 c",TblProductocl3.class).getResultList();
        //confirmamos la transaccion
        em.getTransaction().commit();
        //cerramos
        em.close();
		return listadoProductos;
	}

	@Override
	public void ActualizarProducto(TblProductocl3 producto) {
		//establecemos conexion con la unidad de persistencia...
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LPII_CL3_AHUMADAPACCOJOSE");
		//permite gestionar entidades
		EntityManager em=fabr.createEntityManager();
		//iniciar transaccion
		em.getTransaction().begin();
		//actualizamos
		em.merge(producto);
		//emitimos mensaje por consola
		System.out.println("Producto actualizado correctamente");
		//comfirmamos 
		em.getTransaction().commit();
		//cerramos
		em.close();
				
		
	}

	@Override
	public void EliminarProducto(TblProductocl3 producto) {
		//establecemos la conexion con unidad de persistencia.
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LPII_CL3_AHUMADAPACCOJOSE");
		//gestionar las entidades
		EntityManager em=fabr.createEntityManager();
		//iniciamos la transaccion
		em.getTransaction().begin();
		//recuperamos el codigo a eliminar
		TblProductocl3 elim=em.merge(producto);
		//procedemos a eliminar el registro
		em.remove(elim);
		//emitimos mensaje por consola
		System.out.println("Producto eliminado de la base de datos");
		//confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
				
		
	}

	@Override
	public TblProductocl3 BuscarProducto(TblProductocl3 producto) {
		//establecemos la conexion con la unidad de persistencia..
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LPII_CL3_AHUMADAPACCOJOSE");
		//gestionar las entidads
		EntityManager em=fabr.createEntityManager();
		//iniciamos la transaccion
		em.getTransaction().begin();
		//recuperamos el codigo a buscar
		TblProductocl3 busproducto=em.find(TblProductocl3.class,producto.getIdproductoCL3());
		//confirmamos 
		em.getTransaction().commit();
		//cerramos
		em.close();
		return busproducto;
	}

}
