package com.ourFiles.modelo.entities;

public class Archivo {
	
	private String identifier;
	private String owner;
	private String modifier;
	private String destiny;
	private String origin;
	
	public Archivo(String identifier, String owner, String modifier, String destiny, String origin) {
		super();
		this.identifier = identifier;
		this.owner = owner;
		this.modifier = modifier;
		this.destiny = destiny;
		this.origin = origin;
	}

	public Archivo() {
		super();
		// TODO Auto-generated constructor stub
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
	
	

}
