package com.ourFiles.modelo.persistence;


	
	import org.springframework.data.repository.CrudRepository;
	import com.ourFiles.modelo.entities.Usuario;


	// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
	// CRUD refers Create, Read, Update, Delete

	public interface UsuarioCrud extends CrudRepository<Usuario, Long> {

	}

