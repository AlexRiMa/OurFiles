package com.ourFiles.modelo.persistence;

import com.ourFiles.modelo.entities.Usuario;

public interface UsuarioDao {
	
	void insert(Usuario ususario);
	void remove(Usuario usuario);
	Usuario find(Usuario usuario);
	void update(Usuario usuario);
	

}
