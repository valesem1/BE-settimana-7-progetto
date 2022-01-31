package it.data;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

public class NumTelefono implements Serializable {

	@Entity
	@Table (name="num_telefono")
	
	
	@Id
	
	
	private static final long serialVersionUID = 1L;
	private String numeroTelefono;
	private Contatto contatto;
	
	
	
	@Column (name="numero")
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}@Column (name="numero")
	public Contatto getContatto() {
		return contatto;
	}
	public void setContatto(Contatto contatto) {
		this.contatto = contatto;
	}
	
	
	
	
	
	
	

}
