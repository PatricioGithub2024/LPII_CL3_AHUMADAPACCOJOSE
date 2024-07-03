package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_usuariocl3 database table.
 * 
 */
@Entity
@Table(name="tbl_usuariocl3")
@NamedQuery(name="TblUsuariocl3.findAll", query="SELECT t FROM TblUsuariocl3 t")
public class TblUsuariocl3 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idusuarioCL3;

	private String passwordCL3;

	private String usuarioCL3;

	public TblUsuariocl3() {
	}

	public int getIdusuarioCL3() {
		return this.idusuarioCL3;
	}

	public void setIdusuarioCL3(int idusuarioCL3) {
		this.idusuarioCL3 = idusuarioCL3;
	}

	public String getPasswordCL3() {
		return this.passwordCL3;
	}

	public void setPasswordCL3(String passwordCL3) {
		this.passwordCL3 = passwordCL3;
	}

	public String getUsuarioCL3() {
		return this.usuarioCL3;
	}

	public void setUsuarioCL3(String usuarioCL3) {
		this.usuarioCL3 = usuarioCL3;
	}

}