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

import com.example.entity.Cliente;
import com.example.repository.ClienteRepository;

@RestController
@RequestMapping("/cliente")
@CrossOrigin
public class ClienteService {

	@Autowired
	ClienteRepository clienteRepository;
	
	@GetMapping(path="/buscar")
	public List<Cliente> buscar(){
		return clienteRepository.findAll();
	}
	
	@GetMapping(path="/buscar/{nombres}/{apellidos}")
	public List<Cliente> buscarNombresPorApellidos(
			@PathVariable("nombres") String nombres,
			@PathVariable("apellidos") String apellidos){
		
		return clienteRepository.findByNombresAndApellidos(nombres, apellidos);
	}
	
	@PostMapping(path="/guardar")
	public Cliente guardar(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@DeleteMapping(path="/eliminar/{id_cliente}")
	public void eliminar(@PathVariable int idCliente) {
		clienteRepository.deleteById(idCliente);
	}
}
