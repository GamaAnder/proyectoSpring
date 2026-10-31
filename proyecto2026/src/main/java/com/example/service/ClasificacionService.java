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

import com.example.entity.Clasificacion;
import com.example.repository.ClasificacionRepository;

@RestController
@RequestMapping("/clasificacion")
@CrossOrigin
public class ClasificacionService {

	@Autowired
	ClasificacionRepository clasificacionRepository;

	@GetMapping(path="/buscar")
	public List<Clasificacion> buscar(){
		return clasificacionRepository.findAll();
	}
	
	@PostMapping(path="/guardar")
	public Clasificacion guardar(@RequestBody Clasificacion clasificacion) {
		return clasificacionRepository.save(clasificacion);
	}
	
	@DeleteMapping(path="/eliminar/{id_clasificacion}")
	public void eliminar(@PathVariable int idClasificacion) {
		clasificacionRepository.deleteById(idClasificacion);
	}
}
