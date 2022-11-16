package com.fernandopaniagua.excepcionesaconocer;

import java.util.List;

public class App {

	public static void main(String[] args) {
		//Estas son las excepciones que hay conocer para la certificación.
		
		//RUNTIME EXCEPTIONS
		
		//ArithmeticException --> Divide entre 0.
//		int x = 10;
//		int y = 0;
//		int z = 10/0;
		
		//ArrayIndexOutOfBoundException --> Saliendo del rango del array
//		char[] letras = {'a','b','c'};
//		char letra = letras[8];
		
		//ClassCastException --> Conversión de tipo 'ilegal'
//		Padre p = new Padre();
//		Hijo1 h = (Hijo1)p;
		
		//IllegalArgumentException --> Argumentos incorrectos
//		int x=-5;
//		App.calcular(x);
		
		//NullPointerException --> Se produce al intentar acceder al contenido de un objeto null
//		String x = null;
//		int l = x.length();
		
		//NumberFormatException --> Conversión de String a número imposible
//		String numero = "tres";
//		int n = Integer.parseInt(numero);
		
		//CHECKED EXCEPTIONS
		
		//FileNotFoundException --> Fichero no encontrado.
		//IOException --> No podemos leer o escribir un fichero.
		
		//ERRORS
		
		//ExceptionInInitializerError --> La inicialización de un elemento estático provoca error
//		new ClaseErronea();
		
		//StackOverflowError --> Cuando se produce un desbordamiento de la pila en una llamada recursiva
//		new App().funcionRecursiva(10);
		
		//NoClassDefFoundError --> Cuando una clase que existía en compilación no existe en ejecución (por ejemplo, se ha eliminado el fichero Hijo1.class)
//		new Hijo1();

	}
	
	private static void calcular(int n) {
		if (n<0) {
			throw new IllegalArgumentException("n no puede negativo");
		}
	}
	
	private int funcionRecursiva(int x) {
		x = x + funcionRecursiva(x);
		return x;
	}
	
}
class ClaseErronea {
	static int datoErroneo = 1 / 0;
}
