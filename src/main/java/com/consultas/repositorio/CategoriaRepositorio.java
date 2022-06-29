package com.consultas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.consultas.modelo.Categoria;

public interface CategoriaRepositorio extends JpaRepository<Categoria, Long>{

}
