package com.consultas.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Solicitud_servicio")

public class Solicitud_servicio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;

	@Column(name = "Id_cliente", length = 30, nullable = false)
	private String Id_cliente;

	@Column(name = "Id_usuario", length = 30, nullable = false)
	private String Id_usuario;

	@Column(name = "Id_categoria", length = 11, nullable = false)
	private Long Id_categoria;

	public Solicitud_servicio() {

	}

	public Solicitud_servicio(long id, String id_cliente, String id_usuario, Long id_categoria) {
		super();
		Id = id;
		Id_cliente = id_cliente;
		Id_usuario = id_usuario;
		Id_categoria = id_categoria;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getId_cliente() {
		return Id_cliente;
	}

	public void setId_cliente(String id_cliente) {
		Id_cliente = id_cliente;
	}

	public String getId_usuario() {
		return Id_usuario;
	}

	public void setId_usuario(String id_usuario) {
		Id_usuario = id_usuario;
	}

	public Long getId_categoria() {
		return Id_categoria;
	}

	public void setId_categoria(Long id_categoria) {
		Id_categoria = id_categoria;
	}

}
