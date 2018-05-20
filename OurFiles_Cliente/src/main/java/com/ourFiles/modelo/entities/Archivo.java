package com.ourFiles.modelo.entities;

import javax.persistence.Entity;

@Entity
public class Archivo {
	
	private String identifier;
	private String owner;
	private String modifier;
	private String destiny;
	private String origin;
	private int idAuxUsuario;
	
	
	public Archivo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Archivo(String identifier, String owner, String modifier, String destiny, String origin, int idAuxUsuario) {
		super();
		this.identifier = identifier;
		this.owner = owner;
		this.modifier = modifier;
		this.destiny = destiny;
		this.origin = origin;
		this.idAuxUsuario = idAuxUsuario;
	}


	public String getIdentifier() {
		return identifier;
	}


	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public String getModifier() {
		return modifier;
	}


	public void setModifier(String modifier) {
		this.modifier = modifier;
	}


	public String getDestiny() {
		return destiny;
	}


	public void setDestiny(String destiny) {
		this.destiny = destiny;
	}


	public String getOrigin() {
		return origin;
	}


	public void setOrigin(String origin) {
		this.origin = origin;
	}


	public int getIdAuxUsuario() {
		return idAuxUsuario;
	}


	public void setIdAuxUsuario(int idAuxUsuario) {
		this.idAuxUsuario = idAuxUsuario;
	}
	
	
	
	
	

}
