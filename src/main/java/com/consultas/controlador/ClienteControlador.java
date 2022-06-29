package com.consultas.controlador;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;

import com.consultas.exepciones.ResourseNotFoundException;
import com.consultas.modelo.Cliente;
import com.consultas.repositorio.ClienteRepositorio;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200/")

public class ClienteControlador {

	@Autowired
	private ClienteRepositorio repositorio;

	// Este metodo sirve para listar todos los clientes
	@GetMapping("/clientes")
	public List<Cliente> ListarTodosLosClientes() {
		return repositorio.findAll();
	}

	@PostMapping("/clientes")
	public Cliente guardarCliente(@RequestBody Cliente cliente) {
		return repositorio.save(cliente);
	}

	// Buscar un cliente
	@GetMapping("/clientes/{id}")
	public ResponseEntity<Cliente> obtenerClientePorId(@PathVariable Long id) {
		Cliente cliente = repositorio.findById(id)
				.orElseThrow(() -> new ResourseNotFoundException("No existe el cliente con este ID " + id));
		return ResponseEntity.ok(cliente);
	}

	@PutMapping("/clientes/{id}")
	public ResponseEntity<Cliente> actualizarCliente(@PathVariable Long id, @RequestBody Cliente detalleCliente) {
		Cliente cliente = repositorio.findById(id)
				.orElseThrow(() -> new ResourseNotFoundException("No existe el cliente con este ID " + id));
		//
		cliente.setNombre(detalleCliente.getNombre());
		cliente.setId_categoria(detalleCliente.getId_categoria());
		cliente.setDireccion(detalleCliente.getDireccion());
		cliente.setTelefono1(detalleCliente.getTelefono1());
		cliente.setTelefono2(detalleCliente.getTelefono2());
		cliente.setPais(detalleCliente.getPais());
		cliente.setCiudad(detalleCliente.getCiudad());
		//
		Cliente clienteActualizado = repositorio.save(cliente);
		return ResponseEntity.ok(clienteActualizado);
	}

	@DeleteMapping("/clientes/{id}")
	public Map<String, Boolean> eliminarCliente(@PathVariable(value = "id") Long id) throws Exception {
		Cliente cliente = repositorio.findById(id)
				.orElseThrow(() -> new ResourceAccessException("User not found on :: " + id));

		repositorio.delete(cliente);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
