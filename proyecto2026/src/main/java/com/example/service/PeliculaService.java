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

import com.example.entity.Pelicula;
import com.example.repository.PeliculaRepository;

@RestController
@RequestMapping("/pelicula")
@CrossOrigin
public class PeliculaService {

	@Autowired
	PeliculaRepository peliculaRepository;

	@GetMapping(path="/buscar")
	public List<Pelicula> buscar(){
		return peliculaRepository.findAll();
	}
	
	@PostMapping(path="/guardar")
	public Pelicula guardar(@RequestBody Pelicula pelicula) {
		return peliculaRepository.save(pelicula);
	}
	
	@DeleteMapping(path="/eliminar/{id_pelicula}")
	public void eliminar(@PathVariable int id_pelicula) {
		peliculaRepository.deleteById(id_pelicula);
	}
}
