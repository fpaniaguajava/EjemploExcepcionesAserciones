package com.fernandopaniagua.aserciones;

public class App {

	public static void main(String[] args) {
		/*
		 * assert expresion-logica;
		 * assert expresion-logica : "Mensaje de error";
		 * 
		 */
		App.calcularLongitud(null);
		
		int x=0;
		assert ++x>0 : "Mayor que cero";//NO MODIFICAR NUNCA EN UN ASSERT LOS VALORES DE LOS VARIABLES, OBJETOS, ETC.
		System.out.println("x:" + x);
		x=2;
		assert esPar(x) : "No puede ser impar";
		
		String nombre = null;
		assert nombre != null : "La variable nombre es null";
		if (nombre!=null) {
			System.out.println(nombre.length());
		}
		new Calculadora().dividir(5, 0);
	}

	public static boolean esPar(int x) {
		return x%2==0;
	}
	public static int calcularLongitud(String s) {
		assert s!=null : "No se puede calcular la longitud de un String null";
		return s.length();
	}
	
}
