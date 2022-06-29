package com.consultas.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")

public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "id_cliente", length = 20, nullable = false, unique = true)
	private String id_cliente;

	@Column(name = "id_categoria", length = 30, nullable = false)
	private String id_categoria;

	@Column(name = "nombre", length = 100, nullable = false)
	private String nombre;

	@Column(name = "telefono1", length = 30, nullable = false)
	private String telefono1;

	@Column(name = "telefono2", length = 30, nullable = false)
	private String telefono2;

	@Column(name = "direccion", length = 100, nullable = false)
	private String direccion;

	@Column(name = "ciudad", length = 30, nullable = false)
	private String ciudad;

	@Column(name = "pais", length = 40, nullable = false)
	private String pais;

	public Cliente() {

	}

	public Cliente(long id, String id_cliente, String id_categoria, String nombre, String telefono1, String telefono2,
			String direccion, String ciudad, String pais) {
		super();
		this.id = id;
		this.id_cliente = id_cliente;
		this.id_categoria = id_categoria;
		this.nombre = nombre;
		this.telefono1 = telefono1;
		this.telefono2 = telefono2;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.pais = pais;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(String id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(String id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono1() {
		return telefono1;
	}

	public void setTelefono1(String telefono1) {
		this.telefono1 = telefono1;
	}

	public String getTelefono2() {
		return telefono2;
	}

	public void setTelefono2(String telefono2) {
		this.telefono2 = telefono2;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

}
