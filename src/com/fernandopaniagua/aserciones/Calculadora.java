package com.fernandopaniagua.aserciones;

public class Calculadora {
	public void dividir(int d1, int d2) {
		assert d2!=0 : "El divisor es 0";
		int resultado = d1/d2;
		System.out.println(resultado);
	}
}
