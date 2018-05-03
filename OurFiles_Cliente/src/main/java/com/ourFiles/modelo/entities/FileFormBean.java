package com.ourFiles.modelo.entities;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class FileFormBean {
 
	CommonsMultipartFile fichero;
 
	public CommonsMultipartFile getFichero() {
		return fichero;
	}
 
	public void setFichero(CommonsMultipartFile fichero) {
		this.fichero = fichero;
	}	
}