package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Usuario;

@Repository("usuarioRepository")
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	public List<Usuario> findByNombresAndApellidos(String nombres, String apellidos);
	
	public List<Usuario> findByCorreoAndContrasena(String correo, String contrasena);

}
