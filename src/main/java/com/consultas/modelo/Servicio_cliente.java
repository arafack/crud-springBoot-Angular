package com.consultas.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Servicio_cliente")

public class Servicio_cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id_servicio;

	@Column(name = "Id_cliente", length = 30, nullable = false)
	private String Id_cliente;

	@Column(name = "Nom_servicio", length = 100, nullable = false)
	private String Nom_servicio;

	public Servicio_cliente() {

	}

	public Servicio_cliente(long id_servicio, String id_cliente, String nom_servicio) {
		super();
		Id_servicio = id_servicio;
		Id_cliente = id_cliente;
		Nom_servicio = nom_servicio;
	}

	public long getId_servicio() {
		return Id_servicio;
	}

	public void setId_servicio(long id_servicio) {
		Id_servicio = id_servicio;
	}

	public String getId_cliente() {
		return Id_cliente;
	}

	public void setId_cliente(String id_cliente) {
		Id_cliente = id_cliente;
	}

	public String getNom_servicio() {
		return Nom_servicio;
	}

	public void setNom_servicio(String nom_servicio) {
		Nom_servicio = nom_servicio;
	}

}
