package com.consultas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.consultas.modelo.Cliente;

@Repository

public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {

}
