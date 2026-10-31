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

import com.example.entity.Genero;
import com.example.repository.GeneroRepository;

@RestController
@RequestMapping("/genero")
@CrossOrigin
public class GeneroService {

	@Autowired
	GeneroRepository generoRepository;

	@GetMapping(path="/buscar")
	public List<Genero> buscar(){
		return generoRepository.findAll();
	}
	
	@PostMapping(path="/guardar")
	public Genero guardar(@RequestBody Genero genero) {
		return generoRepository.save(genero);
	}
	
	@DeleteMapping(path="/eliminar/{id_genero}")
	public void eliminar(@PathVariable int idGenero) {
		generoRepository.deleteById(idGenero);
	}
}
