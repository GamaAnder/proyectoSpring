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

import com.example.entity.Asiento;
import com.example.repository.AsientoRepository;

@RestController
@RequestMapping("/asiento")
@CrossOrigin
public class AsientoService {

	@Autowired
	AsientoRepository asientoRepository;

	@GetMapping(path="/buscar")
	public List<Asiento> buscar(){
		return asientoRepository.findAll();
	}
	
	@PostMapping(path="/guardar")
	public Asiento guardar(@RequestBody Asiento asiento) {
		return asientoRepository.save(asiento);
	}
	
	@DeleteMapping(path="/eliminar/{id_asiento}")
	public void eliminar(@PathVariable int idAsiento) {
		asientoRepository.deleteById(idAsiento);
	}
}
