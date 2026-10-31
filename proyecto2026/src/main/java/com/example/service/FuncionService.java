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

import com.example.repository.FuncionRepository;
import com.example.entity.Funcion;
import com.example.entity.Usuario;

@RestController
@RequestMapping("/funcion")
@CrossOrigin
public class FuncionService {

	@Autowired
	FuncionRepository funcionRepository;

	@GetMapping(path="/buscar")
	public List<Funcion> buscar(){
		return funcionRepository.findAll();
	}
	
	@PostMapping(path="/guardar")
	public Funcion guardar(@RequestBody Funcion funcion) {
		return funcionRepository.save(funcion);
	}
	
	@DeleteMapping(path="/eliminar/{id_funcion}")
	public void eliminar(@PathVariable int id_funcion) {
		funcionRepository.deleteById(id_funcion);
	}	
	
}
