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

import com.example.entity.TipoUsuario;
import com.example.repository.TipoUsuarioReposiorio;

@RestController
@RequestMapping("/tipo")
@CrossOrigin
public class TipoUsuarioService {

	@Autowired
	TipoUsuarioReposiorio tipoUsuarioRepository;
	
	@GetMapping(path="/buscar")
	public List<TipoUsuario> buscar(){
		return tipoUsuarioRepository.findAll();
	}
	
	
	@PostMapping(path="/guardar")
	public TipoUsuario guardar(@RequestBody TipoUsuario tipoUsuario) {
		return tipoUsuarioRepository.save(tipoUsuario);
	}
	
	@DeleteMapping(path="/eliminar/{idtipo_usuario}")
	public void eliminar(@PathVariable int idtipoUsuario) {
		tipoUsuarioRepository.deleteById(idtipoUsuario);
	}
	
}
