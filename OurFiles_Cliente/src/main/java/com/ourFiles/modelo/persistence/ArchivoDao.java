package com.ourFiles.modelo.persistence;

import com.ourFiles.modelo.entities.Archivo;

public interface ArchivoDao {
	
	void insert(Archivo archivo);
	void remove(Archivo archivo);
	Archivo find(Archivo archivo);
	void update(Archivo archivo);

}
