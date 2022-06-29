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
import com.consultas.modelo.Categoria;
import com.consultas.repositorio.CategoriaRepositorio;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200/")


public class CategoriaControlador {

	@Autowired
	private CategoriaRepositorio repositorio;

	// Este metodo sirve para listar todos las  categorias
	@GetMapping("/categorias")
	public List<Categoria> ListarTodosLosCategorias() {
		return repositorio.findAll();
	}

	@PostMapping("/categoria")
	public Categoria guardarCategoria(@RequestBody Categoria categoria) {
		return repositorio.save(categoria);
	}

	// Buscar categoria
	@GetMapping("/categorias/{id}")
	public ResponseEntity<Categoria> obtenerCategoriaPorId(@PathVariable Long id) {
		Categoria categoria = repositorio.findById(id)
				.orElseThrow(() -> new ResourseNotFoundException("No existe la categoria con este ID " + id));
		return ResponseEntity.ok(categoria);
	}

	@PutMapping("/categorias/{id}")
	public ResponseEntity<Categoria> actualizarCategoria(@PathVariable Long id,
			@RequestBody Categoria detalleCategoria) {
		Categoria categoria = repositorio.findById(id)
				.orElseThrow(() -> new ResourseNotFoundException("No existe la categoria  con este ID " + id));
		//
		categoria.setNom_categoria(detalleCategoria.getNom_categoria());
		//
		Categoria categoriaActualizado = repositorio.save(categoria);
		return ResponseEntity.ok(categoriaActualizado);
	}

	@DeleteMapping("/categorias/{id}")
	public Map<String, Boolean> eliminarCategori(@PathVariable(value = "id") Long id) throws Exception {
		Categoria categoria = repositorio.findById(id)
				.orElseThrow(() -> new ResourceAccessException("categoria  not found on :: " + id));

		repositorio.delete(categoria);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
		}
	}



