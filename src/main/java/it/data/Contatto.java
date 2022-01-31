package it.data;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name="contatti")

public class Contatto implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nome;
	private String cognome;
	private String email;
	private List<NumTelefono>numtelefoni;
	
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column (name="id")
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		
	
	}@Column (name="id")	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
		
	}@Column (name="id")	
	public String getCognome() {
		
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	@Column (name="id")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}@OneToMany(mappedBy="contatto",cascade= CascadeType.PERSIST)
	public List<NumTelefono> getNumtelefoni() {
		return numtelefoni;
	}
	public void setNumtelefoni(List<NumTelefono> numtelefoni) {
		this.numtelefoni = numtelefoni;
	}
	
	
	
}
