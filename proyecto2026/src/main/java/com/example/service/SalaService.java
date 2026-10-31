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

import com.example.entity.Sala;
import com.example.entity.Usuario;
import com.example.repository.SalaRepository;;

@RestController
@RequestMapping("/sala")
@CrossOrigin

public class SalaService {

	@Autowired
	SalaRepository salaRepository;
	
	@GetMapping(path="/buscar")
	public List<Sala> buscar(){
		return salaRepository.findAll();
	}
	
	@GetMapping(path="/buscar/{nombre}/{filas}")
	public List<Sala> buscarNombrePorFilas(
			@PathVariable("nombre") String nombre,
			@PathVariable("filas") Integer filas){
		
		return salaRepository.findByNombreAndFilas(nombre, filas);
	}	
	
	@PostMapping(path="/guardar")
	public Sala guardar(@RequestBody Sala sala) {
		return salaRepository.save(sala);
	}
	
	@DeleteMapping(path="/eliminar/{id_sala}")
	public void eliminar(@PathVariable int idSala) {
		salaRepository.deleteById(idSala);
	}
}
