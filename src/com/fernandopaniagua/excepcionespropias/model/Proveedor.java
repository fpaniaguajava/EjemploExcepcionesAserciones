package com.fernandopaniagua.excepcionespropias.model;

import com.fernandopaniagua.excepcionespropias.exceptions.ValidacionException;

public class Proveedor {
	private String nombre;
	private Integer anyo;
	private String ciudad;
	/**
	 * Constructor de un proveedor.
	 * 
	 * El nombre debe ser de una longitud > 5
	 * El año de nacimiento debe ser posterior a 1980
	 * 
	 * @param nombre Nombre del cliente
	 * @param anyo Año de nacimiento
	 * @param ciudad Ciudad de residencia
	 * @throws Exception 
	 */
	public Proveedor(String nombre, Integer anyo, String ciudad) throws ValidacionException {
		super();
		if (nombre.length()<=5) throw new ValidacionException(
				ValidacionException.NOMBRE_CORTO, 
				"El nombre es demasiado corto");
		if (anyo<=1980) throw new ValidacionException(
				ValidacionException.NOMBRE_CORTO, 
				"El año es inferior al mínimo");
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
