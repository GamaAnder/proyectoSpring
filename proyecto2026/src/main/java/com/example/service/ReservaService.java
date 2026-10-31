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

import com.example.entity.Reserva;
import com.example.repository.ReservaRepository;

@RestController
@RequestMapping("/reserva")
@CrossOrigin
public class ReservaService {

	@Autowired
	ReservaRepository reservaRepository;

	@GetMapping(path="/buscar")
	public List<Reserva> buscar(){
		return reservaRepository.findAll();
	}
	
	@PostMapping(path="/guardar")
	public Reserva guardar(@RequestBody Reserva reserva) {
		return reservaRepository.save(reserva);
	}
	
	@DeleteMapping(path="/eliminar/{id_reserva}")
	public void eliminar(@PathVariable int id_reserva) {
		reservaRepository.deleteById(id_reserva);
	}
}
