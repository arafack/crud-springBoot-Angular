package com.consultas.modelo;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "usuarios")

public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "id_usuario", length = 20, nullable = false, unique = true)
	private String id_usuario;

	@Column(name = "nombres", length = 50, nullable = false)
	private String nombres;

	@Column(name = "apellidos", length = 50, nullable = false)
	private String apellidos;

	@DateTimeFormat(iso = ISO.DATE)
	@Column(name = "fecha_nacimiento", length = 30, nullable = false)
	private Date fecha_nacimiento;

	@Column(name = "celular", length = 30, nullable = false)
	private String telefono2;

	@Column(name = "direccion", length = 100, nullable = false)
	private String direccion;

	@Column(name = "ciudad", length = 30, nullable = false)
	private String ciudad;

	@Column(name = "pais", length = 40, nullable = false)
	private String pais;

	public Usuario() {
	}

	public Usuario(long id, String id_usuario, String nombres, String apellidos, Date fecha_nacimiento,
			String telefono2, String direccion, String ciudad, String pais) {
		super();
		this.id = id;
		this.id_usuario = id_usuario;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fecha_nacimiento = fecha_nacimiento;
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

	public String getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
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
