package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_productocl3 database table.
 * 
 */
@Entity
@Table(name="tbl_productocl3")
@NamedQuery(name="TblProductocl3.findAll", query="SELECT t FROM TblProductocl3 t")
public class TblProductocl3 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idproductoCL3;

	private String descripCL3;

	private String estadoCL3;

	private String nombreCL3;

	private double preciocompCL3;

	private double precioventaCL3;

	public TblProductocl3() {
	}

	public int getIdproductoCL3() {
		return this.idproductoCL3;
	}

	public void setIdproductoCL3(int idproductoCL3) {
		this.idproductoCL3 = idproductoCL3;
	}

	public String getDescripCL3() {
		return this.descripCL3;
	}

	public void setDescripCL3(String descripCL3) {
		this.descripCL3 = descripCL3;
	}

	public String getEstadoCL3() {
		return this.estadoCL3;
	}

	public void setEstadoCL3(String estadoCL3) {
		this.estadoCL3 = estadoCL3;
	}

	public String getNombreCL3() {
		return this.nombreCL3;
	}

	public void setNombreCL3(String nombreCL3) {
		this.nombreCL3 = nombreCL3;
	}

	public double getPreciocompCL3() {
		return this.preciocompCL3;
	}

	public void setPreciocompCL3(double preciocompCL3) {
		this.preciocompCL3 = preciocompCL3;
	}

	public double getPrecioventaCL3() {
		return this.precioventaCL3;
	}

	public void setPrecioventaCL3(double precioventaCL3) {
		this.precioventaCL3 = precioventaCL3;
	}

}