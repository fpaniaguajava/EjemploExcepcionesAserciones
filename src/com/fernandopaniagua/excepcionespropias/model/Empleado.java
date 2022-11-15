package com.fernandopaniagua.excepcionespropias.model;

import com.fernandopaniagua.excepcionespropias.exceptions.MultipleException;

public class Empleado {
	private String nombre;
	private Integer anyo;
	private String ciudad;
	/**
	 * Constructor de un empleado.
	 * 
	 * El nombre debe ser de una longitud > 5
	 * El año de nacimiento debe ser posterior a 1980
	 * 
	 * @param nombre Nombre del cliente
	 * @param anyo Año de nacimiento
	 * @param ciudad Ciudad de residencia
	 * @throws MultipleException 
	 */
	public Empleado(String nombre, Integer anyo, String ciudad) throws MultipleException {
		super();
		MultipleException me = new MultipleException();
		if (nombre.length()<=5) me.addException(new Exception("Nombre corto"));
		if (anyo<=1980) me.addException(new Exception("Año insuficiente"));
		if (me.getExceptions().size()>0) throw me;
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
