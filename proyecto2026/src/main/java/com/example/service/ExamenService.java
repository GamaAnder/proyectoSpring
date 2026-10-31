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

import com.example.entity.Examen;
import com.example.repository.ExamenRepository;

@RestController
@RequestMapping("/examen")
@CrossOrigin
public class ExamenService {

	@Autowired
	ExamenRepository examenRepository;
	
	@GetMapping(path="/buscar")
	public List<Examen> buscar(){
		return examenRepository.findAll();
	}
	
	@GetMapping(path="/buscar/{carnet}/{nota}")
	public List<Examen> buscarNombresPorApellidos(
			@PathVariable("carnet") String carnet,
			@PathVariable("nota") Integer nota){
		
		return examenRepository.findByCarnetAndNota(carnet, nota);
	}
	
	@PostMapping(path="/guardar")
	public Examen guardar(@RequestBody Examen examen) {
		return examenRepository.save(examen);
	}
	
	@DeleteMapping(path="/eliminar/{idexamen}")
	public void eliminar(@PathVariable int idexamen) {
		examenRepository.deleteById(idexamen);
	}
	
	@PostMapping(path="/login")
	public Examen Login(@RequestBody Examen examen) {
		
		List<Examen> usuarios= examenRepository.findByCarnetAndNota(examen.getCarnet(), examen.getNota());
		if(usuarios.isEmpty()) {
			return null;
		}
		return usuarios.get(0);
	}
}
