package com.consultas.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Restricciones_clientes")

public class Restricciones_cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_restriccion;

	@Column(name = "id_cliente", length = 30, nullable = false)
	private String id_cliente;

	@Column(name = "nom_retriccion", length = 100, nullable = false)
	private String nom_retriccion;

	public Restricciones_cliente() {

	}

	public Restricciones_cliente(long id_restriccion, String id_cliente, String nom_retriccion) {
		super();
		this.id_restriccion = id_restriccion;
		this.id_cliente = id_cliente;
		this.nom_retriccion = nom_retriccion;
	}

	public long getId_restriccion() {
		return id_restriccion;
	}

	public void setId_restriccion(long id_restriccion) {
		this.id_restriccion = id_restriccion;
	}

	public String getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(String id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNom_retriccion() {
		return nom_retriccion;
	}

	public void setNom_retriccion(String nom_retriccion) {
		this.nom_retriccion = nom_retriccion;
	}

}
