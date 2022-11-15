package com.fernandopaniagua.excepcionespropias.model;

import com.fernandopaniagua.excepcionespropias.exceptions.AnyoInsuficienteException;
import com.fernandopaniagua.excepcionespropias.exceptions.NombreCortoException;

public class Cliente {
	private String nombre;
	private Integer anyo;
	private String ciudad;
	/**
	 * Constructor de un cliente.
	 * 
	 * El nombre debe ser de una longitud > 5
	 * El año de nacimiento debe ser posterior a 1980
	 * 
	 * @param nombre Nombre del cliente
	 * @param anyo Año de nacimiento
	 * @param ciudad Ciudad de residencia
	 * @throws Exception 
	 */
	public Cliente(String nombre, Integer anyo, String ciudad) throws Exception {
		super();
		if (nombre.length()<=5) throw new NombreCortoException();
		if (anyo<=1980) throw new AnyoInsuficienteException();
		this.nombre = nombre;
		this.anyo = anyo;
		this.ciudad = ciudad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getAnyo() {
		return anyo;
	}
	public void setAnyo(Integer anyo) {
		this.anyo = anyo;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
}
