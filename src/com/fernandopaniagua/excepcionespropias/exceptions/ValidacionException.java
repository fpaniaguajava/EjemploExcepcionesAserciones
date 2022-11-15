package com.fernandopaniagua.excepcionespropias.exceptions;

public class ValidacionException extends Exception {
	public static final int NOMBRE_CORTO = 1;
	public static final int ANYO_INSUFICIENTE = 2;	
	private int errorCode;
	public ValidacionException(int errorCode, String message) {
		super(message);
		this.errorCode=errorCode;
	}
	public void mostrarMensaje() {
		System.err.printf("Ha ocurrido el error %d: %s\n",this.errorCode,this.getMessage());
	}
	public int getErrorCode() {
		return this.errorCode;
	}
}
