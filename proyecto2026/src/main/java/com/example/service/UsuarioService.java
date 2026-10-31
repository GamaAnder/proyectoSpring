package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Usuario;
import com.example.repository.UsuarioRepository;



@RestController
@RequestMapping("/usuario")
@CrossOrigin
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@GetMapping(path="/buscar")
	public List<Usuario> buscar(){
		return usuarioRepository.findAll();
	}
	
	@GetMapping(path="/buscar/{nombres}/{apellidos}")
	public List<Usuario> buscarNombresPorApellidos(
			@PathVariable("nombres") String nombres,
			@PathVariable("apellidos") String apellidos){
		
		return usuarioRepository.findByNombresAndApellidos(nombres, apellidos);
	}
	
	@PostMapping(path="/guardar")
	public Usuario guardar(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	@DeleteMapping(path="/eliminar/{id_usuario}")
	public void eliminar(@PathVariable int idUsuario) {
		usuarioRepository.deleteById(idUsuario);
	}
	
	@PostMapping(path="/login")
	public Usuario Login(@RequestBody Usuario usuario) {
		
		List<Usuario> usuarios= usuarioRepository.findByCorreoAndContrasena(usuario.getCorreo(), usuario.getContrasena());
		if(usuarios.isEmpty()) {
			return null;
		}
		return usuarios.get(0);
	}
	

}
